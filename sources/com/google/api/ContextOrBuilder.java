package com.google.api;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public interface ContextOrBuilder extends MessageLiteOrBuilder {
    ContextRule getRules(int i7);

    int getRulesCount();

    List<ContextRule> getRulesList();
}
