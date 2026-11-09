package org.chromium.net;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@FunctionalInterface
interface ExperimentalOptionsTranslatingCronetEngineBuilder$ExperimentalOptionsPatch {
    void applyTo(JSONObject jSONObject) throws JSONException;
}
