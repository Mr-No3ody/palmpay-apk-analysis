package com.transsnet.palmpay.core.bean.verify;

import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/transsnet/palmpay/core/bean/verify/VerifySumbitAnswerRsp;", "", "<init>", "()V", "isEnd", "", "Ljava/lang/Boolean;", "nextQuestionDTO", "Lcom/transsnet/palmpay/core/bean/verify/VerifyQuestionNodeBean;", "finallyResultDTO", "Lcom/transsnet/palmpay/core/bean/verify/FinallyResultDTO;", "lib_core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VerifySumbitAnswerRsp {

    @JvmField
    @Nullable
    public FinallyResultDTO finallyResultDTO;

    @JvmField
    @Nullable
    public Boolean isEnd;

    @JvmField
    @Nullable
    public VerifyQuestionNodeBean nextQuestionDTO;
}
