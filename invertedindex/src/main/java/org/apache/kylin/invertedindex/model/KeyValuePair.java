/*
 *
 *
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *
 *  contributor license agreements. See the NOTICE file distributed with
 *
 *  this work for additional information regarding copyright ownership.
 *
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *
 *  (the "License"); you may not use this file except in compliance with
 *
 *  the License. You may obtain a copy of the License at
 *
 *
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *
 *
 *  Unless required by applicable law or agreed to in writing, software
 *
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *
 *  See the License for the specific language governing permissions and
 *
 *  limitations under the License.
 *
 * /
 */

package org.apache.kylin.invertedindex.model;

import org.apache.hadoop.hbase.io.ImmutableBytesWritable;

/**
 * Created by qianzhou on 3/10/15.
 */
public final class KeyValuePair {

    private ImmutableBytesWritable key;
    private ImmutableBytesWritable value;
    private ImmutableBytesWritable dictionary;

    public KeyValuePair(ImmutableBytesWritable key, ImmutableBytesWritable value) {
        this(key, value, null);
    }

    public KeyValuePair(ImmutableBytesWritable key, ImmutableBytesWritable value, ImmutableBytesWritable dictionary) {
        this.key = key;
        this.value = value;
        this.dictionary = dictionary;
    }

    public ImmutableBytesWritable getDictionary() {
        return dictionary;
    }

    public ImmutableBytesWritable getKey() {
        return key;
    }

    public ImmutableBytesWritable getValue() {
        return value;
    }
}
