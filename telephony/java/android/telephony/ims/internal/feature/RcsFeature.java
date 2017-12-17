/*
 * Copyright (C) 2017 The Android Open Source Project
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
 * limitations under the License
 */

package android.telephony.ims.internal.feature;

import android.telephony.ims.internal.aidl.IImsRcsFeature;

/**
 * Base implementation of the RcsFeature APIs. Any ImsService wishing to support RCS should extend
 * this class and provide implementations of the RcsFeature methods that they support.
 * @hide
 */

public class RcsFeature extends ImsFeature {

    private final IImsRcsFeature mImsRcsBinder = new IImsRcsFeature.Stub() {
        // Empty Default Implementation.
    };


    public RcsFeature() {
        super();
    }

    @Override
    public void changeEnabledCapabilities(CapabilityChangeRequest request,
            CapabilityCallbackProxy c) {
        // Do nothing for base implementation.
    }

    @Override
    public void onFeatureRemoved() {

    }

    /**{@inheritDoc}*/
    @Override
    public void onFeatureReady() {

    }

    @Override
    public final IImsRcsFeature getBinder() {
        return mImsRcsBinder;
    }
}
