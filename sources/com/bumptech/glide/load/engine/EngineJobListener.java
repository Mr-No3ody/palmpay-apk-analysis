package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.Key;

/* JADX INFO: loaded from: classes.dex */
interface EngineJobListener {
    void onEngineJobCancelled(q qVar, Key key);

    void onEngineJobComplete(q qVar, Key key, s sVar);
}
