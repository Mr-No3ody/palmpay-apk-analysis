package com.transsnet.palmpay.managemoney.bean;

import N8.q0;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.camera.video.u;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.microsoft.codepush.react.CodePushConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\bF\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b=\b\u0086\b\u0018\u0000 Ì\u00012\u00020\u0001:\u0002Ì\u0001B¯\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0013\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010#\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010$\u001a\u00020\u0003\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010&\u001a\u0004\u0018\u00010'\u0012\b\b\u0002\u0010(\u001a\u00020\u0003\u0012\b\b\u0002\u0010)\u001a\u00020*\u0012\b\b\u0002\u0010+\u001a\u00020\u0013\u0012\b\b\u0002\u0010,\u001a\u00020\u0013\u0012\b\b\u0002\u0010-\u001a\u00020\u0013\u0012\b\b\u0002\u0010.\u001a\u00020\u0013\u0012\b\b\u0002\u0010/\u001a\u00020\u0003\u0012\b\b\u0002\u00100\u001a\u00020\u0003\u0012\b\u00101\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u00102\u001a\u00020\u0013\u0012\b\b\u0002\u00103\u001a\u00020\u0013\u0012\b\b\u0002\u00104\u001a\u00020\u0013\u0012\b\u00105\u001a\u0004\u0018\u000106\u0012\b\u00107\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u00108\u001a\u00020*\u0012\b\b\u0002\u00109\u001a\u00020\r\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010<\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010=\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010>\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010?\u001a\u00020\r¢\u0006\u0004\b@\u0010AB\u0011\b\u0016\u0012\u0006\u0010B\u001a\u00020C¢\u0006\u0004\b@\u0010DJ\u001b\u0010\u0089\u0001\u001a\u00030\u008a\u00012\u0006\u0010B\u001a\u00020C2\u0007\u0010\u008b\u0001\u001a\u00020\u0013H\u0016J\t\u0010\u008c\u0001\u001a\u00020\u0013H\u0016J\t\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u0005J\u0016\u0010\u008e\u0001\u001a\u00020*2\n\u0010\u008f\u0001\u001a\u0005\u0018\u00010\u0090\u0001H\u0096\u0002J\t\u0010\u0091\u0001\u001a\u00020\u0013H\u0016J\u0011\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010FJ\f\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020\rHÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009e\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0013HÆ\u0003J\f\u0010 \u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010¡\u0001\u001a\u00020\u0013HÆ\u0003J\n\u0010¢\u0001\u001a\u00020\u0013HÆ\u0003J\n\u0010£\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¤\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¥\u0001\u001a\u00020\u0013HÆ\u0003J\f\u0010¦\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010§\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¨\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010©\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010ª\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010«\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010¬\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010®\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010FJ\f\u0010¯\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010°\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010±\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\f\u0010²\u0001\u001a\u0004\u0018\u00010'HÆ\u0003J\n\u0010³\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010´\u0001\u001a\u00020*HÆ\u0003J\n\u0010µ\u0001\u001a\u00020\u0013HÆ\u0003J\n\u0010¶\u0001\u001a\u00020\u0013HÆ\u0003J\n\u0010·\u0001\u001a\u00020\u0013HÆ\u0003J\n\u0010¸\u0001\u001a\u00020\u0013HÆ\u0003J\n\u0010¹\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010º\u0001\u001a\u00020\u0003HÆ\u0003J\f\u0010»\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\n\u0010¼\u0001\u001a\u00020\u0013HÆ\u0003J\n\u0010½\u0001\u001a\u00020\u0013HÆ\u0003J\n\u0010¾\u0001\u001a\u00020\u0013HÆ\u0003J\f\u0010¿\u0001\u001a\u0004\u0018\u000106HÆ\u0003J\u0011\u0010À\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010FJ\n\u0010Á\u0001\u001a\u00020*HÆ\u0003J\n\u0010Â\u0001\u001a\u00020\rHÆ\u0003J\u0011\u0010Ã\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010FJ\u0011\u0010Ä\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010FJ\u0011\u0010Å\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010FJ\u0011\u0010Æ\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010FJ\u0011\u0010Ç\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010FJ\n\u0010È\u0001\u001a\u00020\rHÆ\u0003Jè\u0004\u0010É\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00132\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00132\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010$\u001a\u00020\u00032\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020\u00132\b\b\u0002\u0010,\u001a\u00020\u00132\b\b\u0002\u0010-\u001a\u00020\u00132\b\b\u0002\u0010.\u001a\u00020\u00132\b\b\u0002\u0010/\u001a\u00020\u00032\b\b\u0002\u00100\u001a\u00020\u00032\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u00102\u001a\u00020\u00132\b\b\u0002\u00103\u001a\u00020\u00132\b\b\u0002\u00104\u001a\u00020\u00132\n\b\u0002\u00105\u001a\u0004\u0018\u0001062\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u00108\u001a\u00020*2\b\b\u0002\u00109\u001a\u00020\r2\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010?\u001a\u00020\rHÆ\u0001¢\u0006\u0003\u0010Ê\u0001J\n\u0010Ë\u0001\u001a\u00020\u0005HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010G\u001a\u0004\bE\u0010FR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010I\"\u0004\bK\u0010LR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bM\u0010IR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bP\u0010OR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010OR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u0010OR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bU\u0010OR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bV\u0010OR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u0010OR\u0011\u0010\u0011\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bX\u0010OR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b]\u0010IR\u0011\u0010\u0015\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b^\u0010ZR\u0011\u0010\u0016\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b_\u0010ZR\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b`\u0010OR\u0011\u0010\u0018\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\ba\u0010OR\u0011\u0010\u0019\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\bb\u0010ZR\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bc\u0010IR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bd\u0010IR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\be\u0010IR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bf\u0010IR\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bg\u0010IR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bh\u0010IR\u0013\u0010 \u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bi\u0010IR\u0013\u0010!\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bj\u0010IR\u0015\u0010\"\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010G\u001a\u0004\bk\u0010FR\u0013\u0010#\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bl\u0010IR\u0011\u0010$\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bm\u0010OR\u0013\u0010%\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\bn\u0010IR\u0013\u0010&\u001a\u0004\u0018\u00010'¢\u0006\b\n\u0000\u001a\u0004\bo\u0010pR\u0011\u0010(\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bq\u0010OR\u0011\u0010)\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\br\u0010sR\u0011\u0010+\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\bt\u0010ZR\u001a\u0010,\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010Z\"\u0004\bv\u0010\\R\u0011\u0010-\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\bw\u0010ZR\u0011\u0010.\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\bx\u0010ZR\u0011\u0010/\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\by\u0010OR\u0011\u00100\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bz\u0010OR\u0013\u00101\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b{\u0010IR\u0011\u00102\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b|\u0010ZR\u0011\u00103\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b3\u0010ZR\u0011\u00104\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b}\u0010ZR\u0013\u00105\u001a\u0004\u0018\u000106¢\u0006\b\n\u0000\u001a\u0004\b~\u0010\u007fR\u0016\u00107\u001a\u0004\u0018\u00010\u0003¢\u0006\u000b\n\u0002\u0010G\u001a\u0005\b\u0080\u0001\u0010FR\u0012\u00108\u001a\u00020*¢\u0006\t\n\u0000\u001a\u0005\b\u0081\u0001\u0010sR\u0012\u00109\u001a\u00020\r¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010TR\u0016\u0010:\u001a\u0004\u0018\u00010\u0003¢\u0006\u000b\n\u0002\u0010G\u001a\u0005\b\u0083\u0001\u0010FR\u0016\u0010;\u001a\u0004\u0018\u00010\u0003¢\u0006\u000b\n\u0002\u0010G\u001a\u0005\b\u0084\u0001\u0010FR\u0016\u0010<\u001a\u0004\u0018\u00010\u0003¢\u0006\u000b\n\u0002\u0010G\u001a\u0005\b\u0085\u0001\u0010FR\u0016\u0010=\u001a\u0004\u0018\u00010\u0003¢\u0006\u000b\n\u0002\u0010G\u001a\u0005\b\u0086\u0001\u0010FR\u0016\u0010>\u001a\u0004\u0018\u00010\u0003¢\u0006\u000b\n\u0002\u0010G\u001a\u0005\b\u0087\u0001\u0010FR\u0012\u0010?\u001a\u00020\r¢\u0006\t\n\u0000\u001a\u0005\b\u0088\u0001\u0010T¨\u0006Í\u0001"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/ProductBean;", "Landroid/os/Parcelable;", "productId", "", "productName", "", "orderId", "goal", "principal", "totalPayback", "remainingAmount", "earning", "annualizedIncomeRatio", "", "durationDay", "maturityDate", "payTime", "cashTime", "planStatus", "", "checkRule", "paymentType", "productStatus", "startDate", "endDate", "payType", "bankCard", "bankName", "accountNumber", "accountName", "transactionId", "riskAgreementUrl", "productIcon", "cashOrderId", "amount", "productIncreaseUpContent", "incomeTax", "taxSwitchDateContent", "payoutOption", "Lcom/transsnet/palmpay/managemoney/bean/PayoutOption;", "lostInterest", "showBreak", "", "interestSwitchStatus", "renewDepositSwitch", "renewDepositNum", "maxDurationDay", "realEarning", "currentPrincipal", "mainOrderId", "autoRenewal", "isStrictMode", "cashFailType", "advanceSummary", "Lcom/transsnet/palmpay/managemoney/bean/AdvanceSummary;", "maxAdvanceAmount", "hasAdvance", "advanceDailyFeeRate", "autoRepayAmount", "advanceRepayAmount", "advanceRepayPrincipal", "advanceRepayInterest", "earlyWithdrawalFee", "earlyWithdrawalFeeRate", "<init>", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJFJJJJILjava/lang/String;IIJJILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;JLjava/lang/String;Lcom/transsnet/palmpay/managemoney/bean/PayoutOption;JZIIIIJJLjava/lang/String;IIILcom/transsnet/palmpay/managemoney/bean/AdvanceSummary;Ljava/lang/Long;ZFLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;F)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getProductId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getProductName", "()Ljava/lang/String;", "getOrderId", "setOrderId", "(Ljava/lang/String;)V", "getGoal", "getPrincipal", "()J", "getTotalPayback", "getRemainingAmount", "getEarning", "getAnnualizedIncomeRatio", "()F", "getDurationDay", "getMaturityDate", "getPayTime", "getCashTime", "getPlanStatus", "()I", "setPlanStatus", "(I)V", "getCheckRule", "getPaymentType", "getProductStatus", "getStartDate", "getEndDate", "getPayType", "getBankCard", "getBankName", "getAccountNumber", "getAccountName", "getTransactionId", "getRiskAgreementUrl", "getProductIcon", "getCashOrderId", "getAmount", "getProductIncreaseUpContent", "getIncomeTax", "getTaxSwitchDateContent", "getPayoutOption", "()Lcom/transsnet/palmpay/managemoney/bean/PayoutOption;", "getLostInterest", "getShowBreak", "()Z", "getInterestSwitchStatus", "getRenewDepositSwitch", "setRenewDepositSwitch", "getRenewDepositNum", "getMaxDurationDay", "getRealEarning", "getCurrentPrincipal", "getMainOrderId", "getAutoRenewal", "getCashFailType", "getAdvanceSummary", "()Lcom/transsnet/palmpay/managemoney/bean/AdvanceSummary;", "getMaxAdvanceAmount", "getHasAdvance", "getAdvanceDailyFeeRate", "getAutoRepayAmount", "getAdvanceRepayAmount", "getAdvanceRepayPrincipal", "getAdvanceRepayInterest", "getEarlyWithdrawalFee", "getEarlyWithdrawalFeeRate", "writeToParcel", "", "flags", "describeContents", "getShowName", "equals", "other", "", "hashCode", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "component46", "component47", "component48", "component49", "component50", "component51", "component52", "component53", "component54", "component55", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJJJFJJJJILjava/lang/String;IIJJILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;JLjava/lang/String;Lcom/transsnet/palmpay/managemoney/bean/PayoutOption;JZIIIIJJLjava/lang/String;IIILcom/transsnet/palmpay/managemoney/bean/AdvanceSummary;Ljava/lang/Long;ZFLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;F)Lcom/transsnet/palmpay/managemoney/bean/ProductBean;", "toString", "CREATOR", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ProductBean implements Parcelable {

    /* JADX INFO: renamed from: CREATOR, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String accountName;

    @Nullable
    private final String accountNumber;
    private final float advanceDailyFeeRate;

    @Nullable
    private final Long advanceRepayAmount;

    @Nullable
    private final Long advanceRepayInterest;

    @Nullable
    private final Long advanceRepayPrincipal;

    @Nullable
    private final AdvanceSummary advanceSummary;

    @Nullable
    private final Long amount;
    private final float annualizedIncomeRatio;
    private final int autoRenewal;

    @Nullable
    private final Long autoRepayAmount;

    @Nullable
    private final String bankCard;

    @Nullable
    private final String bankName;
    private final int cashFailType;

    @Nullable
    private final String cashOrderId;
    private final long cashTime;

    @Nullable
    private final String checkRule;
    private final long currentPrincipal;
    private final long durationDay;

    @Nullable
    private final Long earlyWithdrawalFee;
    private final float earlyWithdrawalFeeRate;
    private final long earning;
    private final long endDate;

    @Nullable
    private final String goal;
    private final boolean hasAdvance;
    private final long incomeTax;
    private final int interestSwitchStatus;
    private final int isStrictMode;
    private final long lostInterest;

    @Nullable
    private final String mainOrderId;
    private final long maturityDate;

    @Nullable
    private final Long maxAdvanceAmount;
    private final int maxDurationDay;

    @Nullable
    private String orderId;
    private final long payTime;
    private final int payType;
    private final int paymentType;

    @Nullable
    private final PayoutOption payoutOption;
    private int planStatus;
    private final long principal;

    @Nullable
    private final String productIcon;

    @Nullable
    private final Long productId;

    @Nullable
    private final String productIncreaseUpContent;

    @Nullable
    private final String productName;
    private final int productStatus;
    private final long realEarning;
    private final long remainingAmount;
    private final int renewDepositNum;
    private int renewDepositSwitch;

    @Nullable
    private final String riskAgreementUrl;
    private final boolean showBreak;
    private final long startDate;

    @Nullable
    private final String taxSwitchDateContent;
    private final long totalPayback;

    @Nullable
    private final String transactionId;

    /* JADX INFO: renamed from: com.transsnet.palmpay.managemoney.bean.ProductBean$CREATOR, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001d\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"Lcom/transsnet/palmpay/managemoney/bean/ProductBean$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/transsnet/palmpay/managemoney/bean/ProductBean;", "<init>", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/transsnet/palmpay/managemoney/bean/ProductBean;", "module_wealth_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<ProductBean> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ProductBean createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ProductBean(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NotNull
        public ProductBean[] newArray(int size) {
            return new ProductBean[size];
        }
    }

    public ProductBean(@Nullable Long l5, @Nullable String str, @Nullable String str2, @Nullable String str3, long j6, long j10, long j11, long j12, float f10, long j13, long j14, long j15, long j16, int i7, @Nullable String str4, int i10, int i11, long j17, long j18, int i12, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable Long l6, @Nullable String str13, long j19, @Nullable String str14, @Nullable PayoutOption payoutOption, long j20, boolean z3, int i13, int i14, int i15, int i16, long j21, long j22, @Nullable String str15, int i17, int i18, int i19, @Nullable AdvanceSummary advanceSummary, @Nullable Long l8, boolean z8, float f11, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13, @Nullable Long l14, float f12) {
        this.productId = l5;
        this.productName = str;
        this.orderId = str2;
        this.goal = str3;
        this.principal = j6;
        this.totalPayback = j10;
        this.remainingAmount = j11;
        this.earning = j12;
        this.annualizedIncomeRatio = f10;
        this.durationDay = j13;
        this.maturityDate = j14;
        this.payTime = j15;
        this.cashTime = j16;
        this.planStatus = i7;
        this.checkRule = str4;
        this.paymentType = i10;
        this.productStatus = i11;
        this.startDate = j17;
        this.endDate = j18;
        this.payType = i12;
        this.bankCard = str5;
        this.bankName = str6;
        this.accountNumber = str7;
        this.accountName = str8;
        this.transactionId = str9;
        this.riskAgreementUrl = str10;
        this.productIcon = str11;
        this.cashOrderId = str12;
        this.amount = l6;
        this.productIncreaseUpContent = str13;
        this.incomeTax = j19;
        this.taxSwitchDateContent = str14;
        this.payoutOption = payoutOption;
        this.lostInterest = j20;
        this.showBreak = z3;
        this.interestSwitchStatus = i13;
        this.renewDepositSwitch = i14;
        this.renewDepositNum = i15;
        this.maxDurationDay = i16;
        this.realEarning = j21;
        this.currentPrincipal = j22;
        this.mainOrderId = str15;
        this.autoRenewal = i17;
        this.isStrictMode = i18;
        this.cashFailType = i19;
        this.advanceSummary = advanceSummary;
        this.maxAdvanceAmount = l8;
        this.hasAdvance = z8;
        this.advanceDailyFeeRate = f11;
        this.autoRepayAmount = l10;
        this.advanceRepayAmount = l11;
        this.advanceRepayPrincipal = l12;
        this.advanceRepayInterest = l13;
        this.earlyWithdrawalFee = l14;
        this.earlyWithdrawalFeeRate = f12;
    }

    public static /* synthetic */ ProductBean copy$default(ProductBean productBean, Long l5, String str, String str2, String str3, long j6, long j10, long j11, long j12, float f10, long j13, long j14, long j15, long j16, int i7, String str4, int i10, int i11, long j17, long j18, int i12, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Long l6, String str13, long j19, String str14, PayoutOption payoutOption, long j20, boolean z3, int i13, int i14, int i15, int i16, long j21, long j22, String str15, int i17, int i18, int i19, AdvanceSummary advanceSummary, Long l8, boolean z8, float f11, Long l10, Long l11, Long l12, Long l13, Long l14, float f12, int i20, int i21, Object obj) {
        Long l15 = (i20 & 1) != 0 ? productBean.productId : l5;
        String str16 = (i20 & 2) != 0 ? productBean.productName : str;
        String str17 = (i20 & 4) != 0 ? productBean.orderId : str2;
        String str18 = (i20 & 8) != 0 ? productBean.goal : str3;
        long j23 = (i20 & 16) != 0 ? productBean.principal : j6;
        long j24 = (i20 & 32) != 0 ? productBean.totalPayback : j10;
        long j25 = (i20 & 64) != 0 ? productBean.remainingAmount : j11;
        long j26 = (i20 & 128) != 0 ? productBean.earning : j12;
        float f13 = (i20 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? productBean.annualizedIncomeRatio : f10;
        Long l16 = l15;
        String str19 = str16;
        long j27 = (i20 & 512) != 0 ? productBean.durationDay : j13;
        long j28 = (i20 & 1024) != 0 ? productBean.maturityDate : j14;
        long j29 = (i20 & 2048) != 0 ? productBean.payTime : j15;
        long j30 = (i20 & 4096) != 0 ? productBean.cashTime : j16;
        int i22 = (i20 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? productBean.planStatus : i7;
        String str20 = (i20 & 16384) != 0 ? productBean.checkRule : str4;
        int i23 = (i20 & 32768) != 0 ? productBean.paymentType : i10;
        int i24 = (i20 & 65536) != 0 ? productBean.productStatus : i11;
        int i25 = i22;
        String str21 = str20;
        long j31 = (i20 & 131072) != 0 ? productBean.startDate : j17;
        long j32 = (i20 & CodePushConstants.DOWNLOAD_BUFFER_SIZE) != 0 ? productBean.endDate : j18;
        int i26 = i24;
        int i27 = (i20 & 524288) != 0 ? productBean.payType : i12;
        String str22 = (i20 & 1048576) != 0 ? productBean.bankCard : str5;
        String str23 = (i20 & 2097152) != 0 ? productBean.bankName : str6;
        String str24 = (i20 & 4194304) != 0 ? productBean.accountNumber : str7;
        String str25 = (i20 & 8388608) != 0 ? productBean.accountName : str8;
        String str26 = (i20 & PointerEventHelper.X_FLAG_SUPPORTS_HOVER) != 0 ? productBean.transactionId : str9;
        String str27 = (i20 & 33554432) != 0 ? productBean.riskAgreementUrl : str10;
        String str28 = (i20 & 67108864) != 0 ? productBean.productIcon : str11;
        String str29 = (i20 & 134217728) != 0 ? productBean.cashOrderId : str12;
        Long l17 = (i20 & 268435456) != 0 ? productBean.amount : l6;
        String str30 = (i20 & 536870912) != 0 ? productBean.productIncreaseUpContent : str13;
        long j33 = j32;
        long j34 = (i20 & 1073741824) != 0 ? productBean.incomeTax : j19;
        return productBean.copy(l16, str19, str17, str18, j23, j24, j25, j26, f13, j27, j28, j29, j30, i25, str21, i23, i26, j31, j33, i27, str22, str23, str24, str25, str26, str27, str28, str29, l17, str30, j34, (i20 & Integer.MIN_VALUE) != 0 ? productBean.taxSwitchDateContent : str14, (i21 & 1) != 0 ? productBean.payoutOption : payoutOption, (i21 & 2) != 0 ? productBean.lostInterest : j20, (i21 & 4) != 0 ? productBean.showBreak : z3, (i21 & 8) != 0 ? productBean.interestSwitchStatus : i13, (i21 & 16) != 0 ? productBean.renewDepositSwitch : i14, (i21 & 32) != 0 ? productBean.renewDepositNum : i15, (i21 & 64) != 0 ? productBean.maxDurationDay : i16, (i21 & 128) != 0 ? productBean.realEarning : j21, (i21 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? productBean.currentPrincipal : j22, (i21 & 512) != 0 ? productBean.mainOrderId : str15, (i21 & 1024) != 0 ? productBean.autoRenewal : i17, (i21 & 2048) != 0 ? productBean.isStrictMode : i18, (i21 & 4096) != 0 ? productBean.cashFailType : i19, (i21 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? productBean.advanceSummary : advanceSummary, (i21 & 16384) != 0 ? productBean.maxAdvanceAmount : l8, (i21 & 32768) != 0 ? productBean.hasAdvance : z8, (i21 & 65536) != 0 ? productBean.advanceDailyFeeRate : f11, (i21 & 131072) != 0 ? productBean.autoRepayAmount : l10, (i21 & CodePushConstants.DOWNLOAD_BUFFER_SIZE) != 0 ? productBean.advanceRepayAmount : l11, (i21 & 524288) != 0 ? productBean.advanceRepayPrincipal : l12, (i21 & 1048576) != 0 ? productBean.advanceRepayInterest : l13, (i21 & 2097152) != 0 ? productBean.earlyWithdrawalFee : l14, (i21 & 4194304) != 0 ? productBean.earlyWithdrawalFeeRate : f12);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Long getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final long getDurationDay() {
        return this.durationDay;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final long getMaturityDate() {
        return this.maturityDate;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getPayTime() {
        return this.payTime;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final long getCashTime() {
        return this.cashTime;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getPlanStatus() {
        return this.planStatus;
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getCheckRule() {
        return this.checkRule;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getPaymentType() {
        return this.paymentType;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getProductStatus() {
        return this.productStatus;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final long getStartDate() {
        return this.startDate;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final long getEndDate() {
        return this.endDate;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getProductName() {
        return this.productName;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final int getPayType() {
        return this.payType;
    }

    @Nullable
    /* JADX INFO: renamed from: component21, reason: from getter */
    public final String getBankCard() {
        return this.bankCard;
    }

    @Nullable
    /* JADX INFO: renamed from: component22, reason: from getter */
    public final String getBankName() {
        return this.bankName;
    }

    @Nullable
    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    @Nullable
    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getAccountName() {
        return this.accountName;
    }

    @Nullable
    /* JADX INFO: renamed from: component25, reason: from getter */
    public final String getTransactionId() {
        return this.transactionId;
    }

    @Nullable
    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getRiskAgreementUrl() {
        return this.riskAgreementUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getProductIcon() {
        return this.productIcon;
    }

    @Nullable
    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getCashOrderId() {
        return this.cashOrderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component29, reason: from getter */
    public final Long getAmount() {
        return this.amount;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOrderId() {
        return this.orderId;
    }

    @Nullable
    /* JADX INFO: renamed from: component30, reason: from getter */
    public final String getProductIncreaseUpContent() {
        return this.productIncreaseUpContent;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final long getIncomeTax() {
        return this.incomeTax;
    }

    @Nullable
    /* JADX INFO: renamed from: component32, reason: from getter */
    public final String getTaxSwitchDateContent() {
        return this.taxSwitchDateContent;
    }

    @Nullable
    /* JADX INFO: renamed from: component33, reason: from getter */
    public final PayoutOption getPayoutOption() {
        return this.payoutOption;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final long getLostInterest() {
        return this.lostInterest;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final boolean getShowBreak() {
        return this.showBreak;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final int getInterestSwitchStatus() {
        return this.interestSwitchStatus;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final int getRenewDepositSwitch() {
        return this.renewDepositSwitch;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final int getRenewDepositNum() {
        return this.renewDepositNum;
    }

    /* JADX INFO: renamed from: component39, reason: from getter */
    public final int getMaxDurationDay() {
        return this.maxDurationDay;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getGoal() {
        return this.goal;
    }

    /* JADX INFO: renamed from: component40, reason: from getter */
    public final long getRealEarning() {
        return this.realEarning;
    }

    /* JADX INFO: renamed from: component41, reason: from getter */
    public final long getCurrentPrincipal() {
        return this.currentPrincipal;
    }

    @Nullable
    /* JADX INFO: renamed from: component42, reason: from getter */
    public final String getMainOrderId() {
        return this.mainOrderId;
    }

    /* JADX INFO: renamed from: component43, reason: from getter */
    public final int getAutoRenewal() {
        return this.autoRenewal;
    }

    /* JADX INFO: renamed from: component44, reason: from getter */
    public final int getIsStrictMode() {
        return this.isStrictMode;
    }

    /* JADX INFO: renamed from: component45, reason: from getter */
    public final int getCashFailType() {
        return this.cashFailType;
    }

    @Nullable
    /* JADX INFO: renamed from: component46, reason: from getter */
    public final AdvanceSummary getAdvanceSummary() {
        return this.advanceSummary;
    }

    @Nullable
    /* JADX INFO: renamed from: component47, reason: from getter */
    public final Long getMaxAdvanceAmount() {
        return this.maxAdvanceAmount;
    }

    /* JADX INFO: renamed from: component48, reason: from getter */
    public final boolean getHasAdvance() {
        return this.hasAdvance;
    }

    /* JADX INFO: renamed from: component49, reason: from getter */
    public final float getAdvanceDailyFeeRate() {
        return this.advanceDailyFeeRate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getPrincipal() {
        return this.principal;
    }

    @Nullable
    /* JADX INFO: renamed from: component50, reason: from getter */
    public final Long getAutoRepayAmount() {
        return this.autoRepayAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component51, reason: from getter */
    public final Long getAdvanceRepayAmount() {
        return this.advanceRepayAmount;
    }

    @Nullable
    /* JADX INFO: renamed from: component52, reason: from getter */
    public final Long getAdvanceRepayPrincipal() {
        return this.advanceRepayPrincipal;
    }

    @Nullable
    /* JADX INFO: renamed from: component53, reason: from getter */
    public final Long getAdvanceRepayInterest() {
        return this.advanceRepayInterest;
    }

    @Nullable
    /* JADX INFO: renamed from: component54, reason: from getter */
    public final Long getEarlyWithdrawalFee() {
        return this.earlyWithdrawalFee;
    }

    /* JADX INFO: renamed from: component55, reason: from getter */
    public final float getEarlyWithdrawalFeeRate() {
        return this.earlyWithdrawalFeeRate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getTotalPayback() {
        return this.totalPayback;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getRemainingAmount() {
        return this.remainingAmount;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getEarning() {
        return this.earning;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final float getAnnualizedIncomeRatio() {
        return this.annualizedIncomeRatio;
    }

    @NotNull
    public final ProductBean copy(@Nullable Long productId, @Nullable String productName, @Nullable String orderId, @Nullable String goal, long principal, long totalPayback, long remainingAmount, long earning, float annualizedIncomeRatio, long durationDay, long maturityDate, long payTime, long cashTime, int planStatus, @Nullable String checkRule, int paymentType, int productStatus, long startDate, long endDate, int payType, @Nullable String bankCard, @Nullable String bankName, @Nullable String accountNumber, @Nullable String accountName, @Nullable String transactionId, @Nullable String riskAgreementUrl, @Nullable String productIcon, @Nullable String cashOrderId, @Nullable Long amount, @Nullable String productIncreaseUpContent, long incomeTax, @Nullable String taxSwitchDateContent, @Nullable PayoutOption payoutOption, long lostInterest, boolean showBreak, int interestSwitchStatus, int renewDepositSwitch, int renewDepositNum, int maxDurationDay, long realEarning, long currentPrincipal, @Nullable String mainOrderId, int autoRenewal, int isStrictMode, int cashFailType, @Nullable AdvanceSummary advanceSummary, @Nullable Long maxAdvanceAmount, boolean hasAdvance, float advanceDailyFeeRate, @Nullable Long autoRepayAmount, @Nullable Long advanceRepayAmount, @Nullable Long advanceRepayPrincipal, @Nullable Long advanceRepayInterest, @Nullable Long earlyWithdrawalFee, float earlyWithdrawalFeeRate) {
        return new ProductBean(productId, productName, orderId, goal, principal, totalPayback, remainingAmount, earning, annualizedIncomeRatio, durationDay, maturityDate, payTime, cashTime, planStatus, checkRule, paymentType, productStatus, startDate, endDate, payType, bankCard, bankName, accountNumber, accountName, transactionId, riskAgreementUrl, productIcon, cashOrderId, amount, productIncreaseUpContent, incomeTax, taxSwitchDateContent, payoutOption, lostInterest, showBreak, interestSwitchStatus, renewDepositSwitch, renewDepositNum, maxDurationDay, realEarning, currentPrincipal, mainOrderId, autoRenewal, isStrictMode, cashFailType, advanceSummary, maxAdvanceAmount, hasAdvance, advanceDailyFeeRate, autoRepayAmount, advanceRepayAmount, advanceRepayPrincipal, advanceRepayInterest, earlyWithdrawalFee, earlyWithdrawalFeeRate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!ProductBean.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.f(other, "null cannot be cast to non-null type com.transsnet.palmpay.managemoney.bean.ProductBean");
        return Intrinsics.c(this.orderId, ((ProductBean) other).orderId);
    }

    @Nullable
    public final String getAccountName() {
        return this.accountName;
    }

    @Nullable
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final float getAdvanceDailyFeeRate() {
        return this.advanceDailyFeeRate;
    }

    @Nullable
    public final Long getAdvanceRepayAmount() {
        return this.advanceRepayAmount;
    }

    @Nullable
    public final Long getAdvanceRepayInterest() {
        return this.advanceRepayInterest;
    }

    @Nullable
    public final Long getAdvanceRepayPrincipal() {
        return this.advanceRepayPrincipal;
    }

    @Nullable
    public final AdvanceSummary getAdvanceSummary() {
        return this.advanceSummary;
    }

    @Nullable
    public final Long getAmount() {
        return this.amount;
    }

    public final float getAnnualizedIncomeRatio() {
        return this.annualizedIncomeRatio;
    }

    public final int getAutoRenewal() {
        return this.autoRenewal;
    }

    @Nullable
    public final Long getAutoRepayAmount() {
        return this.autoRepayAmount;
    }

    @Nullable
    public final String getBankCard() {
        return this.bankCard;
    }

    @Nullable
    public final String getBankName() {
        return this.bankName;
    }

    public final int getCashFailType() {
        return this.cashFailType;
    }

    @Nullable
    public final String getCashOrderId() {
        return this.cashOrderId;
    }

    public final long getCashTime() {
        return this.cashTime;
    }

    @Nullable
    public final String getCheckRule() {
        return this.checkRule;
    }

    public final long getCurrentPrincipal() {
        return this.currentPrincipal;
    }

    public final long getDurationDay() {
        return this.durationDay;
    }

    @Nullable
    public final Long getEarlyWithdrawalFee() {
        return this.earlyWithdrawalFee;
    }

    public final float getEarlyWithdrawalFeeRate() {
        return this.earlyWithdrawalFeeRate;
    }

    public final long getEarning() {
        return this.earning;
    }

    public final long getEndDate() {
        return this.endDate;
    }

    @Nullable
    public final String getGoal() {
        return this.goal;
    }

    public final boolean getHasAdvance() {
        return this.hasAdvance;
    }

    public final long getIncomeTax() {
        return this.incomeTax;
    }

    public final int getInterestSwitchStatus() {
        return this.interestSwitchStatus;
    }

    public final long getLostInterest() {
        return this.lostInterest;
    }

    @Nullable
    public final String getMainOrderId() {
        return this.mainOrderId;
    }

    public final long getMaturityDate() {
        return this.maturityDate;
    }

    @Nullable
    public final Long getMaxAdvanceAmount() {
        return this.maxAdvanceAmount;
    }

    public final int getMaxDurationDay() {
        return this.maxDurationDay;
    }

    @Nullable
    public final String getOrderId() {
        return this.orderId;
    }

    public final long getPayTime() {
        return this.payTime;
    }

    public final int getPayType() {
        return this.payType;
    }

    public final int getPaymentType() {
        return this.paymentType;
    }

    @Nullable
    public final PayoutOption getPayoutOption() {
        return this.payoutOption;
    }

    public final int getPlanStatus() {
        return this.planStatus;
    }

    public final long getPrincipal() {
        return this.principal;
    }

    @Nullable
    public final String getProductIcon() {
        return this.productIcon;
    }

    @Nullable
    public final Long getProductId() {
        return this.productId;
    }

    @Nullable
    public final String getProductIncreaseUpContent() {
        return this.productIncreaseUpContent;
    }

    @Nullable
    public final String getProductName() {
        return this.productName;
    }

    public final int getProductStatus() {
        return this.productStatus;
    }

    public final long getRealEarning() {
        return this.realEarning;
    }

    public final long getRemainingAmount() {
        return this.remainingAmount;
    }

    public final int getRenewDepositNum() {
        return this.renewDepositNum;
    }

    public final int getRenewDepositSwitch() {
        return this.renewDepositSwitch;
    }

    @Nullable
    public final String getRiskAgreementUrl() {
        return this.riskAgreementUrl;
    }

    public final boolean getShowBreak() {
        return this.showBreak;
    }

    @Nullable
    public final String getShowName() {
        if (!TextUtils.isEmpty(this.goal)) {
            return this.goal;
        }
        if (!TextUtils.isEmpty(this.productName)) {
            return this.productName;
        }
        return this.durationDay + "-fixed-day";
    }

    public final long getStartDate() {
        return this.startDate;
    }

    @Nullable
    public final String getTaxSwitchDateContent() {
        return this.taxSwitchDateContent;
    }

    public final long getTotalPayback() {
        return this.totalPayback;
    }

    @Nullable
    public final String getTransactionId() {
        return this.transactionId;
    }

    public int hashCode() {
        String str = this.orderId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final int isStrictMode() {
        return this.isStrictMode;
    }

    public final void setOrderId(@Nullable String str) {
        this.orderId = str;
    }

    public final void setPlanStatus(int i7) {
        this.planStatus = i7;
    }

    public final void setRenewDepositSwitch(int i7) {
        this.renewDepositSwitch = i7;
    }

    @NotNull
    public String toString() {
        Long l5 = this.productId;
        String str = this.productName;
        String str2 = this.orderId;
        String str3 = this.goal;
        long j6 = this.principal;
        long j10 = this.totalPayback;
        long j11 = this.remainingAmount;
        long j12 = this.earning;
        float f10 = this.annualizedIncomeRatio;
        long j13 = this.durationDay;
        long j14 = this.maturityDate;
        long j15 = this.payTime;
        long j16 = this.cashTime;
        int i7 = this.planStatus;
        String str4 = this.checkRule;
        int i10 = this.paymentType;
        int i11 = this.productStatus;
        long j17 = this.startDate;
        long j18 = this.endDate;
        int i12 = this.payType;
        String str5 = this.bankCard;
        String str6 = this.bankName;
        String str7 = this.accountNumber;
        String str8 = this.accountName;
        String str9 = this.transactionId;
        String str10 = this.riskAgreementUrl;
        String str11 = this.productIcon;
        String str12 = this.cashOrderId;
        Long l6 = this.amount;
        String str13 = this.productIncreaseUpContent;
        long j19 = this.incomeTax;
        String str14 = this.taxSwitchDateContent;
        PayoutOption payoutOption = this.payoutOption;
        long j20 = this.lostInterest;
        boolean z3 = this.showBreak;
        int i13 = this.interestSwitchStatus;
        int i14 = this.renewDepositSwitch;
        int i15 = this.renewDepositNum;
        int i16 = this.maxDurationDay;
        long j21 = this.realEarning;
        long j22 = this.currentPrincipal;
        String str15 = this.mainOrderId;
        int i17 = this.autoRenewal;
        int i18 = this.isStrictMode;
        int i19 = this.cashFailType;
        AdvanceSummary advanceSummary = this.advanceSummary;
        Long l8 = this.maxAdvanceAmount;
        boolean z8 = this.hasAdvance;
        float f11 = this.advanceDailyFeeRate;
        Long l10 = this.autoRepayAmount;
        Long l11 = this.advanceRepayAmount;
        Long l12 = this.advanceRepayPrincipal;
        Long l13 = this.advanceRepayInterest;
        Long l14 = this.earlyWithdrawalFee;
        float f12 = this.earlyWithdrawalFeeRate;
        StringBuilder sb2 = new StringBuilder("ProductBean(productId=");
        sb2.append(l5);
        sb2.append(", productName=");
        sb2.append(str);
        sb2.append(", orderId=");
        u.x(sb2, str2, ", goal=", str3, ", principal=");
        sb2.append(j6);
        u.v(sb2, ", totalPayback=", j10, ", remainingAmount=");
        sb2.append(j11);
        u.v(sb2, ", earning=", j12, ", annualizedIncomeRatio=");
        sb2.append(f10);
        sb2.append(", durationDay=");
        sb2.append(j13);
        u.v(sb2, ", maturityDate=", j14, ", payTime=");
        sb2.append(j15);
        u.v(sb2, ", cashTime=", j16, ", planStatus=");
        sb2.append(i7);
        sb2.append(", checkRule=");
        sb2.append(str4);
        sb2.append(", paymentType=");
        u.u(sb2, i10, ", productStatus=", i11, ", startDate=");
        sb2.append(j17);
        u.v(sb2, ", endDate=", j18, ", payType=");
        sb2.append(i12);
        sb2.append(", bankCard=");
        sb2.append(str5);
        sb2.append(", bankName=");
        u.x(sb2, str6, ", accountNumber=", str7, ", accountName=");
        u.x(sb2, str8, ", transactionId=", str9, ", riskAgreementUrl=");
        u.x(sb2, str10, ", productIcon=", str11, ", cashOrderId=");
        sb2.append(str12);
        sb2.append(", amount=");
        sb2.append(l6);
        sb2.append(", productIncreaseUpContent=");
        sb2.append(str13);
        sb2.append(", incomeTax=");
        sb2.append(j19);
        sb2.append(", taxSwitchDateContent=");
        sb2.append(str14);
        sb2.append(", payoutOption=");
        sb2.append(payoutOption);
        u.v(sb2, ", lostInterest=", j20, ", showBreak=");
        sb2.append(z3);
        sb2.append(", interestSwitchStatus=");
        sb2.append(i13);
        sb2.append(", renewDepositSwitch=");
        u.u(sb2, i14, ", renewDepositNum=", i15, ", maxDurationDay=");
        sb2.append(i16);
        sb2.append(", realEarning=");
        sb2.append(j21);
        u.v(sb2, ", currentPrincipal=", j22, ", mainOrderId=");
        sb2.append(str15);
        sb2.append(", autoRenewal=");
        sb2.append(i17);
        sb2.append(", isStrictMode=");
        u.u(sb2, i18, ", cashFailType=", i19, ", advanceSummary=");
        sb2.append(advanceSummary);
        sb2.append(", maxAdvanceAmount=");
        sb2.append(l8);
        sb2.append(", hasAdvance=");
        sb2.append(z8);
        sb2.append(", advanceDailyFeeRate=");
        sb2.append(f11);
        sb2.append(", autoRepayAmount=");
        q0.w(sb2, l10, ", advanceRepayAmount=", l11, ", advanceRepayPrincipal=");
        q0.w(sb2, l12, ", advanceRepayInterest=", l13, ", earlyWithdrawalFee=");
        sb2.append(l14);
        sb2.append(", earlyWithdrawalFeeRate=");
        sb2.append(f12);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeValue(this.productId);
        parcel.writeString(this.productName);
        parcel.writeString(this.orderId);
        parcel.writeString(this.goal);
        parcel.writeLong(this.principal);
        parcel.writeLong(this.totalPayback);
        parcel.writeLong(this.remainingAmount);
        parcel.writeLong(this.earning);
        parcel.writeFloat(this.annualizedIncomeRatio);
        parcel.writeLong(this.durationDay);
        parcel.writeLong(this.maturityDate);
        parcel.writeLong(this.payTime);
        parcel.writeLong(this.cashTime);
        parcel.writeInt(this.planStatus);
        parcel.writeString(this.checkRule);
        parcel.writeInt(this.paymentType);
        parcel.writeInt(this.productStatus);
        parcel.writeLong(this.startDate);
        parcel.writeLong(this.endDate);
        parcel.writeInt(this.payType);
        parcel.writeString(this.bankCard);
        parcel.writeString(this.bankName);
        parcel.writeString(this.accountNumber);
        parcel.writeString(this.accountName);
        parcel.writeString(this.transactionId);
        parcel.writeString(this.riskAgreementUrl);
        parcel.writeString(this.productIcon);
        parcel.writeString(this.cashOrderId);
        parcel.writeValue(this.amount);
        parcel.writeString(this.productIncreaseUpContent);
        parcel.writeLong(this.incomeTax);
        parcel.writeString(this.taxSwitchDateContent);
        parcel.writeParcelable(this.payoutOption, flags);
        parcel.writeLong(this.lostInterest);
        parcel.writeByte(this.showBreak ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.interestSwitchStatus);
        parcel.writeInt(this.renewDepositSwitch);
        parcel.writeInt(this.renewDepositNum);
        parcel.writeInt(this.maxDurationDay);
        parcel.writeLong(this.realEarning);
        parcel.writeLong(this.currentPrincipal);
        parcel.writeString(this.mainOrderId);
        parcel.writeInt(this.autoRenewal);
        parcel.writeInt(this.isStrictMode);
        parcel.writeInt(this.cashFailType);
        parcel.writeParcelable(this.advanceSummary, flags);
        parcel.writeValue(this.maxAdvanceAmount);
        parcel.writeByte(this.hasAdvance ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.advanceDailyFeeRate);
        parcel.writeValue(this.autoRepayAmount);
        parcel.writeValue(this.advanceRepayAmount);
        parcel.writeValue(this.advanceRepayPrincipal);
        parcel.writeValue(this.advanceRepayInterest);
        parcel.writeValue(this.earlyWithdrawalFee);
        parcel.writeFloat(this.earlyWithdrawalFeeRate);
    }

    public /* synthetic */ ProductBean(Long l5, String str, String str2, String str3, long j6, long j10, long j11, long j12, float f10, long j13, long j14, long j15, long j16, int i7, String str4, int i10, int i11, long j17, long j18, int i12, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Long l6, String str13, long j19, String str14, PayoutOption payoutOption, long j20, boolean z3, int i13, int i14, int i15, int i16, long j21, long j22, String str15, int i17, int i18, int i19, AdvanceSummary advanceSummary, Long l8, boolean z8, float f11, Long l10, Long l11, Long l12, Long l13, Long l14, float f12, int i20, int i21, DefaultConstructorMarker defaultConstructorMarker) {
        this(l5, str, str2, str3, (i20 & 16) != 0 ? 0L : j6, (i20 & 32) != 0 ? 0L : j10, (i20 & 64) != 0 ? 0L : j11, (i20 & 128) != 0 ? 0L : j12, (i20 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? 0.0f : f10, (i20 & 512) != 0 ? 0L : j13, (i20 & 1024) != 0 ? 0L : j14, (i20 & 2048) != 0 ? 0L : j15, (i20 & 4096) != 0 ? 0L : j16, (i20 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? 0 : i7, (i20 & 16384) != 0 ? null : str4, (i20 & 32768) != 0 ? 0 : i10, (i20 & 65536) != 0 ? 0 : i11, (131072 & i20) != 0 ? 0L : j17, (262144 & i20) != 0 ? 0L : j18, (524288 & i20) != 0 ? 0 : i12, str5, str6, str7, str8, str9, str10, str11, str12, l6, str13, (i20 & 1073741824) != 0 ? 0L : j19, str14, payoutOption, (i21 & 2) != 0 ? 0L : j20, (i21 & 4) != 0 ? false : z3, (i21 & 8) != 0 ? 0 : i13, (i21 & 16) != 0 ? 0 : i14, (i21 & 32) != 0 ? 0 : i15, (i21 & 64) != 0 ? 0 : i16, (i21 & 128) != 0 ? 0L : j21, (i21 & IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER) != 0 ? 0L : j22, str15, (i21 & 1024) != 0 ? 0 : i17, (i21 & 2048) != 0 ? 0 : i18, (i21 & 4096) != 0 ? 0 : i19, advanceSummary, l8, (i21 & 32768) != 0 ? false : z8, (i21 & 65536) != 0 ? 0.0f : f11, l10, l11, l12, l13, l14, (4194304 & i21) != 0 ? 0.0f : f12);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ProductBean(@NotNull Parcel parcel) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Class cls = Long.TYPE;
        Object value = parcel.readValue(cls.getClassLoader());
        Long l5 = value instanceof Long ? (Long) value : null;
        String string = parcel.readString();
        String string2 = parcel.readString();
        String string3 = parcel.readString();
        long j6 = parcel.readLong();
        long j10 = parcel.readLong();
        long j11 = parcel.readLong();
        long j12 = parcel.readLong();
        float f10 = parcel.readFloat();
        long j13 = parcel.readLong();
        long j14 = parcel.readLong();
        long j15 = parcel.readLong();
        long j16 = parcel.readLong();
        int i7 = parcel.readInt();
        String string4 = parcel.readString();
        int i10 = parcel.readInt();
        int i11 = parcel.readInt();
        long j17 = parcel.readLong();
        long j18 = parcel.readLong();
        int i12 = parcel.readInt();
        String string5 = parcel.readString();
        String string6 = parcel.readString();
        String string7 = parcel.readString();
        String string8 = parcel.readString();
        String string9 = parcel.readString();
        String string10 = parcel.readString();
        String string11 = parcel.readString();
        String string12 = parcel.readString();
        Object value2 = parcel.readValue(cls.getClassLoader());
        Long l6 = value2 instanceof Long ? (Long) value2 : null;
        String string13 = parcel.readString();
        long j19 = parcel.readLong();
        String string14 = parcel.readString();
        PayoutOption payoutOption = (PayoutOption) parcel.readParcelable(PayoutOption.class.getClassLoader());
        long j20 = parcel.readLong();
        boolean z3 = parcel.readByte() != 0;
        int i13 = parcel.readInt();
        int i14 = parcel.readInt();
        int i15 = parcel.readInt();
        int i16 = parcel.readInt();
        long j21 = parcel.readLong();
        long j22 = parcel.readLong();
        String string15 = parcel.readString();
        int i17 = parcel.readInt();
        int i18 = parcel.readInt();
        int i19 = parcel.readInt();
        AdvanceSummary advanceSummary = (AdvanceSummary) parcel.readParcelable(AdvanceSummary.class.getClassLoader());
        Object value3 = parcel.readValue(cls.getClassLoader());
        Long l8 = value3 instanceof Long ? (Long) value3 : null;
        boolean z8 = parcel.readByte() != 0;
        float f11 = parcel.readFloat();
        Object value4 = parcel.readValue(cls.getClassLoader());
        Long l10 = value4 instanceof Long ? (Long) value4 : null;
        Object value5 = parcel.readValue(cls.getClassLoader());
        Long l11 = value5 instanceof Long ? (Long) value5 : null;
        Object value6 = parcel.readValue(cls.getClassLoader());
        Long l12 = value6 instanceof Long ? (Long) value6 : null;
        Object value7 = parcel.readValue(cls.getClassLoader());
        Long l13 = value7 instanceof Long ? (Long) value7 : null;
        Object value8 = parcel.readValue(cls.getClassLoader());
        this(l5, string, string2, string3, j6, j10, j11, j12, f10, j13, j14, j15, j16, i7, string4, i10, i11, j17, j18, i12, string5, string6, string7, string8, string9, string10, string11, string12, l6, string13, j19, string14, payoutOption, j20, z3, i13, i14, i15, i16, j21, j22, string15, i17, i18, i19, advanceSummary, l8, z8, f11, l10, l11, l12, l13, value8 instanceof Long ? (Long) value8 : null, parcel.readFloat());
    }
}
