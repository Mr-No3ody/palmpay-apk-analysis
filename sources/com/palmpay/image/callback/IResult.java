package com.palmpay.image.callback;

/* JADX INFO: loaded from: classes3.dex */
public interface IResult<T> {
    void onFail();

    void onSuccess(T t);
}
