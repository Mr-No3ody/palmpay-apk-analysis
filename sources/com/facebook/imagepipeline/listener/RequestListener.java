package com.facebook.imagepipeline.listener;

import com.facebook.imagepipeline.producers.ProducerListener;
import com.facebook.imagepipeline.request.d;

/* JADX INFO: loaded from: classes.dex */
public interface RequestListener extends ProducerListener {
    void onRequestCancellation(String str);

    void onRequestFailure(d dVar, String str, Throwable th, boolean z3);

    void onRequestStart(d dVar, Object obj, String str, boolean z3);

    void onRequestSuccess(d dVar, String str, boolean z3);
}
