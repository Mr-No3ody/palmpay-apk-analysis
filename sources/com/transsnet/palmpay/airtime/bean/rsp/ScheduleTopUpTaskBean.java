package com.transsnet.palmpay.airtime.bean.rsp;

import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.camera2.internal.F;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.microsoft.codepush.react.CodePushConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Parcelize
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\bu\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\b\u0010#\u001a\u0004\u0018\u00010\"\u0012\b\u0010$\u001a\u0004\u0018\u00010\"\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b&\u0010'J\u000b\u0010s\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010x\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u00105J\u0010\u0010y\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u00105J\u0010\u0010z\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u00105J\u0010\u0010{\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u00105J\u000b\u0010|\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010HJ\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u00105J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010HJ\u0011\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010HJ\u0011\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u0010HJ\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\f\u0010\u008e\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u008f\u0001\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0002\u0010iJ\u0011\u0010\u0090\u0001\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0002\u0010iJ\u0011\u0010\u0091\u0001\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0002\u0010iJ\f\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0090\u0003\u0010\u0093\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\"2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0003\u0010\u0094\u0001J\u0007\u0010\u0095\u0001\u001a\u00020\tJ\u0016\u0010\u0096\u0001\u001a\u00020\"2\n\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0098\u0001HÖ\u0003J\n\u0010\u0099\u0001\u001a\u00020\tHÖ\u0001J\n\u0010\u009a\u0001\u001a\u00020\u0003HÖ\u0001J\u001b\u0010\u009b\u0001\u001a\u00030\u009c\u00012\b\u0010\u009d\u0001\u001a\u00030\u009e\u00012\u0007\u0010\u009f\u0001\u001a\u00020\tR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010)\"\u0004\b-\u0010+R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010)\"\u0004\b1\u0010+R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010)\"\u0004\b3\u0010+R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u00108\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001e\u0010\n\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u00108\u001a\u0004\b9\u00105\"\u0004\b:\u00107R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u00108\u001a\u0004\b;\u00105\"\u0004\b<\u00107R\u001e\u0010\f\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u00108\u001a\u0004\b=\u00105\"\u0004\b>\u00107R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010)\"\u0004\b@\u0010+R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010)\"\u0004\bB\u0010+R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010)\"\u0004\bD\u0010+R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010)\"\u0004\bF\u0010+R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010K\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u00108\u001a\u0004\bL\u00105\"\u0004\bM\u00107R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010)\"\u0004\bO\u0010+R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010)\"\u0004\bQ\u0010+R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010)\"\u0004\bS\u0010+R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010)\"\u0004\bU\u0010+R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010)\"\u0004\bW\u0010+R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010K\u001a\u0004\bX\u0010H\"\u0004\bY\u0010JR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010K\u001a\u0004\bZ\u0010H\"\u0004\b[\u0010JR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010K\u001a\u0004\b\\\u0010H\"\u0004\b]\u0010JR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010)\"\u0004\b_\u0010+R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010)\"\u0004\ba\u0010+R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010)\"\u0004\bc\u0010+R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010)\"\u0004\be\u0010+R\u001c\u0010 \u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010)\"\u0004\bg\u0010+R\u001e\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u0010\n\u0002\u0010l\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\u001e\u0010#\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u0010\n\u0002\u0010l\u001a\u0004\bm\u0010i\"\u0004\bn\u0010kR\u001e\u0010$\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u0010\n\u0002\u0010l\u001a\u0004\bo\u0010i\"\u0004\bp\u0010kR\u001c\u0010%\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bq\u0010)\"\u0004\br\u0010+¨\u0006 \u0001"}, d2 = {"Lcom/transsnet/palmpay/airtime/bean/rsp/ScheduleTopUpTaskBean;", "Landroid/os/Parcelable;", "id", "", "memberId", "phone", "iccid", "tagName", "topupType", "", "timeType", "infoType", "timeValue", "billId", "billerId", "billerName", "itemId", "lowBalance", "", "statusValue", "updateTime", "createTime", "modificatorId", "creatorId", "operatorCode", "rechargeAmount", "paymentAmount", "discountAmount", "billerLogo", "desc", "timeText", "darkBenefitsImg", "benefitsImg", "cashInGuidance", "", "pushGuidance", "replace", "frequencyRemark", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getMemberId", "setMemberId", "getPhone", "setPhone", "getIccid", "setIccid", "getTagName", "setTagName", "getTopupType", "()Ljava/lang/Integer;", "setTopupType", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getTimeType", "setTimeType", "getInfoType", "setInfoType", "getTimeValue", "setTimeValue", "getBillId", "setBillId", "getBillerId", "setBillerId", "getBillerName", "setBillerName", "getItemId", "setItemId", "getLowBalance", "()Ljava/lang/Long;", "setLowBalance", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getStatusValue", "setStatusValue", "getUpdateTime", "setUpdateTime", "getCreateTime", "setCreateTime", "getModificatorId", "setModificatorId", "getCreatorId", "setCreatorId", "getOperatorCode", "setOperatorCode", "getRechargeAmount", "setRechargeAmount", "getPaymentAmount", "setPaymentAmount", "getDiscountAmount", "setDiscountAmount", "getBillerLogo", "setBillerLogo", "getDesc", "setDesc", "getTimeText", "setTimeText", "getDarkBenefitsImg", "setDarkBenefitsImg", "getBenefitsImg", "setBenefitsImg", "getCashInGuidance", "()Ljava/lang/Boolean;", "setCashInGuidance", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getPushGuidance", "setPushGuidance", "getReplace", "setReplace", "getFrequencyRemark", "setFrequencyRemark", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/transsnet/palmpay/airtime/bean/rsp/ScheduleTopUpTaskBean;", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "module_biller_export_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ScheduleTopUpTaskBean implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ScheduleTopUpTaskBean> CREATOR = new Creator();

    @Nullable
    private String benefitsImg;

    @Nullable
    private String billId;

    @Nullable
    private String billerId;

    @Nullable
    private String billerLogo;

    @Nullable
    private String billerName;

    @Nullable
    private Boolean cashInGuidance;

    @Nullable
    private String createTime;

    @Nullable
    private String creatorId;

    @Nullable
    private String darkBenefitsImg;

    @Nullable
    private String desc;

    @Nullable
    private Long discountAmount;

    @Nullable
    private String frequencyRemark;

    @Nullable
    private String iccid;

    @Nullable
    private String id;

    @Nullable
    private Integer infoType;

    @Nullable
    private String itemId;

    @Nullable
    private Long lowBalance;

    @Nullable
    private String memberId;

    @Nullable
    private String modificatorId;

    @Nullable
    private String operatorCode;

    @Nullable
    private Long paymentAmount;

    @Nullable
    private String phone;

    @Nullable
    private Boolean pushGuidance;

    @Nullable
    private Long rechargeAmount;

    @Nullable
    private Boolean replace;

    @Nullable
    private Integer statusValue;

    @Nullable
    private String tagName;

    @Nullable
    private String timeText;

    @Nullable
    private Integer timeType;

    @Nullable
    private Integer timeValue;

    @Nullable
    private Integer topupType;

    @Nullable
    private String updateTime;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ScheduleTopUpTaskBean> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScheduleTopUpTaskBean createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            Boolean boolValueOf3 = null;
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Integer numValueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            String string14 = parcel.readString();
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf4 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string15 = parcel.readString();
            String string16 = parcel.readString();
            String string17 = parcel.readString();
            String string18 = parcel.readString();
            String string19 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() != 0) {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ScheduleTopUpTaskBean(string, string2, string3, string4, string5, numValueOf, numValueOf2, numValueOf3, numValueOf4, string6, string7, string8, string9, lValueOf, numValueOf5, string10, string11, string12, string13, string14, lValueOf2, lValueOf3, lValueOf4, string15, string16, string17, string18, string19, boolValueOf, boolValueOf2, boolValueOf3, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ScheduleTopUpTaskBean[] newArray(int i7) {
            return new ScheduleTopUpTaskBean[i7];
        }
    }

    public ScheduleTopUpTaskBean(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable Long l5, @Nullable Integer num5, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable Long l6, @Nullable Long l8, @Nullable Long l10, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str20) {
        this.id = str;
        this.memberId = str2;
        this.phone = str3;
        this.iccid = str4;
        this.tagName = str5;
        this.topupType = num;
        this.timeType = num2;
        this.infoType = num3;
        this.timeValue = num4;
        this.billId = str6;
        this.billerId = str7;
        this.billerName = str8;
        this.itemId = str9;
        this.lowBalance = l5;
        this.statusValue = num5;
        this.updateTime = str10;
        this.createTime = str11;
        this.modificatorId = str12;
        this.creatorId = str13;
        this.operatorCode = str14;
        this.rechargeAmount = l6;
        this.paymentAmount = l8;
        this.discountAmount = l10;
        this.billerLogo = str15;
        this.desc = str16;
        this.timeText = str17;
        this.darkBenefitsImg = str18;
        this.benefitsImg = str19;
        this.cashInGuidance = bool;
        this.pushGuidance = bool2;
        this.replace = bool3;
        this.frequencyRemark = str20;
    }

    public static /* synthetic */ ScheduleTopUpTaskBean copy$default(ScheduleTopUpTaskBean scheduleTopUpTaskBean, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, Integer num4, String str6, String str7, String str8, String str9, Long l5, Integer num5, String str10, String str11, String str12, String str13, String str14, Long l6, Long l8, Long l10, String str15, String str16, String str17, String str18, String str19, Boolean bool, Boolean bool2, Boolean bool3, String str20, int i7, Object obj) {
        String str21;
        Boolean bool4;
        String str22 = (i7 & 1) != 0 ? scheduleTopUpTaskBean.id : str;
        String str23 = (i7 & 2) != 0 ? scheduleTopUpTaskBean.memberId : str2;
        String str24 = (i7 & 4) != 0 ? scheduleTopUpTaskBean.phone : str3;
        String str25 = (i7 & 8) != 0 ? scheduleTopUpTaskBean.iccid : str4;
        String str26 = (i7 & 16) != 0 ? scheduleTopUpTaskBean.tagName : str5;
        Integer num6 = (i7 & 32) != 0 ? scheduleTopUpTaskBean.topupType : num;
        Integer num7 = (i7 & 64) != 0 ? scheduleTopUpTaskBean.timeType : num2;
        Integer num8 = (i7 & 128) != 0 ? scheduleTopUpTaskBean.infoType : num3;
        Integer num9 = (i7 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? scheduleTopUpTaskBean.timeValue : num4;
        String str27 = (i7 & 512) != 0 ? scheduleTopUpTaskBean.billId : str6;
        String str28 = (i7 & 1024) != 0 ? scheduleTopUpTaskBean.billerId : str7;
        String str29 = (i7 & 2048) != 0 ? scheduleTopUpTaskBean.billerName : str8;
        String str30 = (i7 & 4096) != 0 ? scheduleTopUpTaskBean.itemId : str9;
        Long l11 = (i7 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? scheduleTopUpTaskBean.lowBalance : l5;
        String str31 = str22;
        Integer num10 = (i7 & 16384) != 0 ? scheduleTopUpTaskBean.statusValue : num5;
        String str32 = (i7 & 32768) != 0 ? scheduleTopUpTaskBean.updateTime : str10;
        String str33 = (i7 & 65536) != 0 ? scheduleTopUpTaskBean.createTime : str11;
        String str34 = (i7 & 131072) != 0 ? scheduleTopUpTaskBean.modificatorId : str12;
        String str35 = (i7 & CodePushConstants.DOWNLOAD_BUFFER_SIZE) != 0 ? scheduleTopUpTaskBean.creatorId : str13;
        String str36 = (i7 & 524288) != 0 ? scheduleTopUpTaskBean.operatorCode : str14;
        Long l12 = (i7 & 1048576) != 0 ? scheduleTopUpTaskBean.rechargeAmount : l6;
        Long l13 = (i7 & 2097152) != 0 ? scheduleTopUpTaskBean.paymentAmount : l8;
        Long l14 = (i7 & 4194304) != 0 ? scheduleTopUpTaskBean.discountAmount : l10;
        String str37 = (i7 & 8388608) != 0 ? scheduleTopUpTaskBean.billerLogo : str15;
        String str38 = (i7 & PointerEventHelper.X_FLAG_SUPPORTS_HOVER) != 0 ? scheduleTopUpTaskBean.desc : str16;
        String str39 = (i7 & 33554432) != 0 ? scheduleTopUpTaskBean.timeText : str17;
        String str40 = (i7 & 67108864) != 0 ? scheduleTopUpTaskBean.darkBenefitsImg : str18;
        String str41 = (i7 & 134217728) != 0 ? scheduleTopUpTaskBean.benefitsImg : str19;
        Boolean bool5 = (i7 & 268435456) != 0 ? scheduleTopUpTaskBean.cashInGuidance : bool;
        Boolean bool6 = (i7 & 536870912) != 0 ? scheduleTopUpTaskBean.pushGuidance : bool2;
        Boolean bool7 = (i7 & 1073741824) != 0 ? scheduleTopUpTaskBean.replace : bool3;
        if ((i7 & Integer.MIN_VALUE) != 0) {
            bool4 = bool7;
            str21 = scheduleTopUpTaskBean.frequencyRemark;
        } else {
            str21 = str20;
            bool4 = bool7;
        }
        return scheduleTopUpTaskBean.copy(str31, str23, str24, str25, str26, num6, num7, num8, num9, str27, str28, str29, str30, l11, num10, str32, str33, str34, str35, str36, l12, l13, l14, str37, str38, str39, str40, str41, bool5, bool6, bool4, str21);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getBillId() {
        return this.billId;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getBillerId() {
        return this.billerId;
    }

    @Nullable
    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getBillerName() {
        return this.billerName;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Long getLowBalance() {
        return this.lowBalance;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final Integer getStatusValue() {
        return this.statusValue;
    }

    @Nullable
    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getUpdateTime() {
        return this.updateTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getCreateTime() {
        return this.createTime;
    }

    @Nullable
    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getModificatorId() {
        return this.modificatorId;
    }

    @Nullable
    /* JADX INFO: renamed from: component19, reason: from getter */
    public final String getCreatorId() {
        return this.creatorId;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMemberId() {
        return this.memberId;
    }

    @Nullable
    /* JADX INFO: renamed from: component20, reason: from getter */
    public final String getOperatorCode() {
        return this.operatorCode;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final Long getRechargeAmount() {
        return this.rechargeAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final Long getPaymentAmount() {
        return this.paymentAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final Long getDiscountAmount() {
        return this.discountAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getBillerLogo() {
        return this.billerLogo;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getTimeText() {
        return this.timeText;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getDarkBenefitsImg() {
        return this.darkBenefitsImg;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getBenefitsImg() {
        return this.benefitsImg;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final Boolean getCashInGuidance() {
        return this.cashInGuidance;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final Boolean getPushGuidance() {
        return this.pushGuidance;
    }

    @Nullable
    /* JADX INFO: renamed from: component31, reason: from getter */
    public final Boolean getReplace() {
        return this.replace;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getFrequencyRemark() {
        return this.frequencyRemark;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIccid() {
        return this.iccid;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTagName() {
        return this.tagName;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getTopupType() {
        return this.topupType;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getTimeType() {
        return this.timeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Integer getInfoType() {
        return this.infoType;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getTimeValue() {
        return this.timeValue;
    }

    @NotNull
    public final ScheduleTopUpTaskBean copy(@Nullable String id2, @Nullable String memberId, @Nullable String phone, @Nullable String iccid, @Nullable String tagName, @Nullable Integer topupType, @Nullable Integer timeType, @Nullable Integer infoType, @Nullable Integer timeValue, @Nullable String billId, @Nullable String billerId, @Nullable String billerName, @Nullable String itemId, @Nullable Long lowBalance, @Nullable Integer statusValue, @Nullable String updateTime, @Nullable String createTime, @Nullable String modificatorId, @Nullable String creatorId, @Nullable String operatorCode, @Nullable Long rechargeAmount, @Nullable Long paymentAmount, @Nullable Long discountAmount, @Nullable String billerLogo, @Nullable String desc, @Nullable String timeText, @Nullable String darkBenefitsImg, @Nullable String benefitsImg, @Nullable Boolean cashInGuidance, @Nullable Boolean pushGuidance, @Nullable Boolean replace, @Nullable String frequencyRemark) {
        return new ScheduleTopUpTaskBean(id2, memberId, phone, iccid, tagName, topupType, timeType, infoType, timeValue, billId, billerId, billerName, itemId, lowBalance, statusValue, updateTime, createTime, modificatorId, creatorId, operatorCode, rechargeAmount, paymentAmount, discountAmount, billerLogo, desc, timeText, darkBenefitsImg, benefitsImg, cashInGuidance, pushGuidance, replace, frequencyRemark);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScheduleTopUpTaskBean)) {
            return false;
        }
        ScheduleTopUpTaskBean scheduleTopUpTaskBean = (ScheduleTopUpTaskBean) other;
        return Intrinsics.c(this.id, scheduleTopUpTaskBean.id) && Intrinsics.c(this.memberId, scheduleTopUpTaskBean.memberId) && Intrinsics.c(this.phone, scheduleTopUpTaskBean.phone) && Intrinsics.c(this.iccid, scheduleTopUpTaskBean.iccid) && Intrinsics.c(this.tagName, scheduleTopUpTaskBean.tagName) && Intrinsics.c(this.topupType, scheduleTopUpTaskBean.topupType) && Intrinsics.c(this.timeType, scheduleTopUpTaskBean.timeType) && Intrinsics.c(this.infoType, scheduleTopUpTaskBean.infoType) && Intrinsics.c(this.timeValue, scheduleTopUpTaskBean.timeValue) && Intrinsics.c(this.billId, scheduleTopUpTaskBean.billId) && Intrinsics.c(this.billerId, scheduleTopUpTaskBean.billerId) && Intrinsics.c(this.billerName, scheduleTopUpTaskBean.billerName) && Intrinsics.c(this.itemId, scheduleTopUpTaskBean.itemId) && Intrinsics.c(this.lowBalance, scheduleTopUpTaskBean.lowBalance) && Intrinsics.c(this.statusValue, scheduleTopUpTaskBean.statusValue) && Intrinsics.c(this.updateTime, scheduleTopUpTaskBean.updateTime) && Intrinsics.c(this.createTime, scheduleTopUpTaskBean.createTime) && Intrinsics.c(this.modificatorId, scheduleTopUpTaskBean.modificatorId) && Intrinsics.c(this.creatorId, scheduleTopUpTaskBean.creatorId) && Intrinsics.c(this.operatorCode, scheduleTopUpTaskBean.operatorCode) && Intrinsics.c(this.rechargeAmount, scheduleTopUpTaskBean.rechargeAmount) && Intrinsics.c(this.paymentAmount, scheduleTopUpTaskBean.paymentAmount) && Intrinsics.c(this.discountAmount, scheduleTopUpTaskBean.discountAmount) && Intrinsics.c(this.billerLogo, scheduleTopUpTaskBean.billerLogo) && Intrinsics.c(this.desc, scheduleTopUpTaskBean.desc) && Intrinsics.c(this.timeText, scheduleTopUpTaskBean.timeText) && Intrinsics.c(this.darkBenefitsImg, scheduleTopUpTaskBean.darkBenefitsImg) && Intrinsics.c(this.benefitsImg, scheduleTopUpTaskBean.benefitsImg) && Intrinsics.c(this.cashInGuidance, scheduleTopUpTaskBean.cashInGuidance) && Intrinsics.c(this.pushGuidance, scheduleTopUpTaskBean.pushGuidance) && Intrinsics.c(this.replace, scheduleTopUpTaskBean.replace) && Intrinsics.c(this.frequencyRemark, scheduleTopUpTaskBean.frequencyRemark);
    }

    @Nullable
    public final String getBenefitsImg() {
        return this.benefitsImg;
    }

    @Nullable
    public final String getBillId() {
        return this.billId;
    }

    @Nullable
    public final String getBillerId() {
        return this.billerId;
    }

    @Nullable
    public final String getBillerLogo() {
        return this.billerLogo;
    }

    @Nullable
    public final String getBillerName() {
        return this.billerName;
    }

    @Nullable
    public final Boolean getCashInGuidance() {
        return this.cashInGuidance;
    }

    @Nullable
    public final String getCreateTime() {
        return this.createTime;
    }

    @Nullable
    public final String getCreatorId() {
        return this.creatorId;
    }

    @Nullable
    public final String getDarkBenefitsImg() {
        return this.darkBenefitsImg;
    }

    @Nullable
    public final String getDesc() {
        return this.desc;
    }

    @Nullable
    public final Long getDiscountAmount() {
        return this.discountAmount;
    }

    @Nullable
    public final String getFrequencyRemark() {
        return this.frequencyRemark;
    }

    @Nullable
    public final String getIccid() {
        return this.iccid;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Integer getInfoType() {
        return this.infoType;
    }

    @Nullable
    public final String getItemId() {
        return this.itemId;
    }

    @Nullable
    public final Long getLowBalance() {
        return this.lowBalance;
    }

    @Nullable
    public final String getMemberId() {
        return this.memberId;
    }

    @Nullable
    public final String getModificatorId() {
        return this.modificatorId;
    }

    @Nullable
    public final String getOperatorCode() {
        return this.operatorCode;
    }

    @Nullable
    public final Long getPaymentAmount() {
        return this.paymentAmount;
    }

    @Nullable
    public final String getPhone() {
        return this.phone;
    }

    @Nullable
    public final Boolean getPushGuidance() {
        return this.pushGuidance;
    }

    @Nullable
    public final Long getRechargeAmount() {
        return this.rechargeAmount;
    }

    @Nullable
    public final Boolean getReplace() {
        return this.replace;
    }

    @Nullable
    public final Integer getStatusValue() {
        return this.statusValue;
    }

    @Nullable
    public final String getTagName() {
        return this.tagName;
    }

    @Nullable
    public final String getTimeText() {
        return this.timeText;
    }

    @Nullable
    public final Integer getTimeType() {
        return this.timeType;
    }

    @Nullable
    public final Integer getTimeValue() {
        return this.timeValue;
    }

    @Nullable
    public final Integer getTopupType() {
        return this.topupType;
    }

    @Nullable
    public final String getUpdateTime() {
        return this.updateTime;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.memberId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phone;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.iccid;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.tagName;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.topupType;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.timeType;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.infoType;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.timeValue;
        int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str6 = this.billId;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.billerId;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.billerName;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.itemId;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        Long l5 = this.lowBalance;
        int iHashCode14 = (iHashCode13 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Integer num5 = this.statusValue;
        int iHashCode15 = (iHashCode14 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str10 = this.updateTime;
        int iHashCode16 = (iHashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.createTime;
        int iHashCode17 = (iHashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.modificatorId;
        int iHashCode18 = (iHashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.creatorId;
        int iHashCode19 = (iHashCode18 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.operatorCode;
        int iHashCode20 = (iHashCode19 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Long l6 = this.rechargeAmount;
        int iHashCode21 = (iHashCode20 + (l6 == null ? 0 : l6.hashCode())) * 31;
        Long l8 = this.paymentAmount;
        int iHashCode22 = (iHashCode21 + (l8 == null ? 0 : l8.hashCode())) * 31;
        Long l10 = this.discountAmount;
        int iHashCode23 = (iHashCode22 + (l10 == null ? 0 : l10.hashCode())) * 31;
        String str15 = this.billerLogo;
        int iHashCode24 = (iHashCode23 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.desc;
        int iHashCode25 = (iHashCode24 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.timeText;
        int iHashCode26 = (iHashCode25 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.darkBenefitsImg;
        int iHashCode27 = (iHashCode26 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.benefitsImg;
        int iHashCode28 = (iHashCode27 + (str19 == null ? 0 : str19.hashCode())) * 31;
        Boolean bool = this.cashInGuidance;
        int iHashCode29 = (iHashCode28 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.pushGuidance;
        int iHashCode30 = (iHashCode29 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.replace;
        int iHashCode31 = (iHashCode30 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str20 = this.frequencyRemark;
        return iHashCode31 + (str20 != null ? str20.hashCode() : 0);
    }

    public final void setBenefitsImg(@Nullable String str) {
        this.benefitsImg = str;
    }

    public final void setBillId(@Nullable String str) {
        this.billId = str;
    }

    public final void setBillerId(@Nullable String str) {
        this.billerId = str;
    }

    public final void setBillerLogo(@Nullable String str) {
        this.billerLogo = str;
    }

    public final void setBillerName(@Nullable String str) {
        this.billerName = str;
    }

    public final void setCashInGuidance(@Nullable Boolean bool) {
        this.cashInGuidance = bool;
    }

    public final void setCreateTime(@Nullable String str) {
        this.createTime = str;
    }

    public final void setCreatorId(@Nullable String str) {
        this.creatorId = str;
    }

    public final void setDarkBenefitsImg(@Nullable String str) {
        this.darkBenefitsImg = str;
    }

    public final void setDesc(@Nullable String str) {
        this.desc = str;
    }

    public final void setDiscountAmount(@Nullable Long l5) {
        this.discountAmount = l5;
    }

    public final void setFrequencyRemark(@Nullable String str) {
        this.frequencyRemark = str;
    }

    public final void setIccid(@Nullable String str) {
        this.iccid = str;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setInfoType(@Nullable Integer num) {
        this.infoType = num;
    }

    public final void setItemId(@Nullable String str) {
        this.itemId = str;
    }

    public final void setLowBalance(@Nullable Long l5) {
        this.lowBalance = l5;
    }

    public final void setMemberId(@Nullable String str) {
        this.memberId = str;
    }

    public final void setModificatorId(@Nullable String str) {
        this.modificatorId = str;
    }

    public final void setOperatorCode(@Nullable String str) {
        this.operatorCode = str;
    }

    public final void setPaymentAmount(@Nullable Long l5) {
        this.paymentAmount = l5;
    }

    public final void setPhone(@Nullable String str) {
        this.phone = str;
    }

    public final void setPushGuidance(@Nullable Boolean bool) {
        this.pushGuidance = bool;
    }

    public final void setRechargeAmount(@Nullable Long l5) {
        this.rechargeAmount = l5;
    }

    public final void setReplace(@Nullable Boolean bool) {
        this.replace = bool;
    }

    public final void setStatusValue(@Nullable Integer num) {
        this.statusValue = num;
    }

    public final void setTagName(@Nullable String str) {
        this.tagName = str;
    }

    public final void setTimeText(@Nullable String str) {
        this.timeText = str;
    }

    public final void setTimeType(@Nullable Integer num) {
        this.timeType = num;
    }

    public final void setTimeValue(@Nullable Integer num) {
        this.timeValue = num;
    }

    public final void setTopupType(@Nullable Integer num) {
        this.topupType = num;
    }

    public final void setUpdateTime(@Nullable String str) {
        this.updateTime = str;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.memberId;
        String str3 = this.phone;
        String str4 = this.iccid;
        String str5 = this.tagName;
        Integer num = this.topupType;
        Integer num2 = this.timeType;
        Integer num3 = this.infoType;
        Integer num4 = this.timeValue;
        String str6 = this.billId;
        String str7 = this.billerId;
        String str8 = this.billerName;
        String str9 = this.itemId;
        Long l5 = this.lowBalance;
        Integer num5 = this.statusValue;
        String str10 = this.updateTime;
        String str11 = this.createTime;
        String str12 = this.modificatorId;
        String str13 = this.creatorId;
        String str14 = this.operatorCode;
        Long l6 = this.rechargeAmount;
        Long l8 = this.paymentAmount;
        Long l10 = this.discountAmount;
        String str15 = this.billerLogo;
        String str16 = this.desc;
        String str17 = this.timeText;
        String str18 = this.darkBenefitsImg;
        String str19 = this.benefitsImg;
        Boolean bool = this.cashInGuidance;
        Boolean bool2 = this.pushGuidance;
        Boolean bool3 = this.replace;
        String str20 = this.frequencyRemark;
        StringBuilder sbF = F.f("ScheduleTopUpTaskBean(id=", str, ", memberId=", str2, ", phone=");
        u.x(sbF, str3, ", iccid=", str4, ", tagName=");
        sbF.append(str5);
        sbF.append(", topupType=");
        sbF.append(num);
        sbF.append(", timeType=");
        sbF.append(num2);
        sbF.append(", infoType=");
        sbF.append(num3);
        sbF.append(", timeValue=");
        sbF.append(num4);
        sbF.append(", billId=");
        sbF.append(str6);
        sbF.append(", billerId=");
        u.x(sbF, str7, ", billerName=", str8, ", itemId=");
        sbF.append(str9);
        sbF.append(", lowBalance=");
        sbF.append(l5);
        sbF.append(", statusValue=");
        sbF.append(num5);
        sbF.append(", updateTime=");
        sbF.append(str10);
        sbF.append(", createTime=");
        u.x(sbF, str11, ", modificatorId=", str12, ", creatorId=");
        u.x(sbF, str13, ", operatorCode=", str14, ", rechargeAmount=");
        q0.w(sbF, l6, ", paymentAmount=", l8, ", discountAmount=");
        sbF.append(l10);
        sbF.append(", billerLogo=");
        sbF.append(str15);
        sbF.append(", desc=");
        u.x(sbF, str16, ", timeText=", str17, ", darkBenefitsImg=");
        u.x(sbF, str18, ", benefitsImg=", str19, ", cashInGuidance=");
        sbF.append(bool);
        sbF.append(", pushGuidance=");
        sbF.append(bool2);
        sbF.append(", replace=");
        sbF.append(bool3);
        sbF.append(", frequencyRemark=");
        sbF.append(str20);
        sbF.append(")");
        return sbF.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.memberId);
        dest.writeString(this.phone);
        dest.writeString(this.iccid);
        dest.writeString(this.tagName);
        Integer num = this.topupType;
        if (num == null) {
            dest.writeInt(0);
        } else {
            q0.s(dest, 1, num);
        }
        Integer num2 = this.timeType;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            q0.s(dest, 1, num2);
        }
        Integer num3 = this.infoType;
        if (num3 == null) {
            dest.writeInt(0);
        } else {
            q0.s(dest, 1, num3);
        }
        Integer num4 = this.timeValue;
        if (num4 == null) {
            dest.writeInt(0);
        } else {
            q0.s(dest, 1, num4);
        }
        dest.writeString(this.billId);
        dest.writeString(this.billerId);
        dest.writeString(this.billerName);
        dest.writeString(this.itemId);
        Long l5 = this.lowBalance;
        if (l5 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l5);
        }
        Integer num5 = this.statusValue;
        if (num5 == null) {
            dest.writeInt(0);
        } else {
            q0.s(dest, 1, num5);
        }
        dest.writeString(this.updateTime);
        dest.writeString(this.createTime);
        dest.writeString(this.modificatorId);
        dest.writeString(this.creatorId);
        dest.writeString(this.operatorCode);
        Long l6 = this.rechargeAmount;
        if (l6 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l6);
        }
        Long l8 = this.paymentAmount;
        if (l8 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l8);
        }
        Long l10 = this.discountAmount;
        if (l10 == null) {
            dest.writeInt(0);
        } else {
            q0.t(dest, 1, l10);
        }
        dest.writeString(this.billerLogo);
        dest.writeString(this.desc);
        dest.writeString(this.timeText);
        dest.writeString(this.darkBenefitsImg);
        dest.writeString(this.benefitsImg);
        Boolean bool = this.cashInGuidance;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            q0.r(dest, 1, bool);
        }
        Boolean bool2 = this.pushGuidance;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            q0.r(dest, 1, bool2);
        }
        Boolean bool3 = this.replace;
        if (bool3 == null) {
            dest.writeInt(0);
        } else {
            q0.r(dest, 1, bool3);
        }
        dest.writeString(this.frequencyRemark);
    }
}
