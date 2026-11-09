package com.google.rpc;

import com.google.protobuf.MessageLiteOrBuilder;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface BadRequestOrBuilder extends MessageLiteOrBuilder {
    BadRequest.FieldViolation getFieldViolations(int i7);

    int getFieldViolationsCount();

    List<BadRequest.FieldViolation> getFieldViolationsList();
}
