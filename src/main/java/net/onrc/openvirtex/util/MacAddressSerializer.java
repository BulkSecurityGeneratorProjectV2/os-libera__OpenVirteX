/*
 * ******************************************************************************
 *  Copyright 2019 Korea University & Open Networking Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *  ******************************************************************************
 *  Developed by Libera team, Operating Systems Lab of Korea University
 *  ******************************************************************************
 */

package net.onrc.openvirtex.util;

import java.lang.reflect.Type;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import org.projectfloodlight.openflow.types.MacAddress;

/**
 * Created by Administrator on 2016-05-02.
 */
public class MacAddressSerializer implements JsonSerializer<MacAddress> {

    @Override
    public JsonElement serialize(MacAddress mac, Type t,
                                 JsonSerializationContext c) {
        final JsonPrimitive res = new JsonPrimitive(mac.toString());
        return res;
    }
}