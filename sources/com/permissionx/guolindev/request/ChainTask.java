package com.permissionx.guolindev.request;

import java.util.List;
import p218o7.a;
import p218o7.b;

/* JADX INFO: loaded from: classes3.dex */
public interface ChainTask {
    void finish();

    a getExplainScope();

    b getForwardScope();

    void request();

    void requestAgain(List<String> list);
}
