/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.audiotoolbox;

import org.robovm.rt.bro.Struct;
import org.robovm.rt.bro.annotation.StructMember;

public final class AUMutableRenderActionFlags extends Struct<AUMutableRenderActionFlags> {

    public AUMutableRenderActionFlags() {}

    public AUMutableRenderActionFlags(AURenderActionFlags flags) {
        set(flags);
    }

    public AURenderActionFlags get() {
        return new AURenderActionFlags(getValue());
    }

    public void set(AURenderActionFlags flags) {
        setValue((int) flags.value());
    }

    @StructMember(0)
    private native int getValue();

    @StructMember(0)
    private native void setValue(int value);
}
