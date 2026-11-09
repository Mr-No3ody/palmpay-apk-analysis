package com.transsnet.palmpay.account.bean.rsp;

import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R&\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bj\n\u0012\u0004\u0012\u00020\u0005\u0018\u0001`\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u000e8\u0006X\u0087D¢\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/transsnet/palmpay/account/bean/rsp/TeenAuthRecord;", "", "<init>", "()V", "guardianHeadPoint", "", "guardianName", "guardianPhone", "guardianMemberId", "describeTitle", "describeDetail", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "guardianAuthStatus", "", "verifyIcon", "verifyAuthStatus", "verifyContent", "module_account_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TeenAuthRecord {

    @JvmField
    @Nullable
    public ArrayList<String> describeDetail;

    @JvmField
    @Nullable
    public String describeTitle;

    @JvmField
    public int guardianAuthStatus;

    @JvmField
    @Nullable
    public String guardianHeadPoint;

    @JvmField
    @Nullable
    public String guardianMemberId;

    @JvmField
    @Nullable
    public String guardianName;

    @JvmField
    @Nullable
    public String guardianPhone;

    @JvmField
    public final int verifyAuthStatus;

    @JvmField
    @Nullable
    public String verifyContent;

    @JvmField
    @Nullable
    public String verifyIcon;
}
