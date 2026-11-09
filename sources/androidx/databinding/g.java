package androidx.databinding;

import android.content.Intent;
import android.content.IntentSender;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.support.v4.os.IResultReceiver;
import android.support.v4.os.ResultReceiver;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.navigation.NavBackStackEntryState;
import androidx.versionedparcelable.ParcelImpl;
import com.facebook.common.callercontext.ContextChain;
import com.github.mikephil.charting.data.Entry;
import com.google.api.Service;
import com.palmpay.lib.liveness.model.AuthenticationResponse;
import com.palmpay.lib.liveness.model.CheckRequest;
import com.palmpay.lib.liveness.model.CheckResponse;
import com.palmpay.lib.liveness.model.ClientConfig;
import com.palmpay.lib.liveness.model.ExtendFeature;
import com.palmpay.lib.liveness.model.FacingDetectThreshold;
import com.palmpay.lib.liveness.model.LiveBaseResponse;
import com.palmpay.lib.liveness.model.LivenessAction;
import com.palmpay.lib.liveness.model.LivenessCheckResponse;
import com.palmpay.lib.liveness.model.LivenessConfigResponse;
import com.tencent.mmkv.ParcelableMMKV;
import com.transsnet.palmpay.account.LoginInfo;
import com.transsnet.palmpay.share.ShareItem;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import pub.devrel.easypermissions.AppSettingsDialog;

/* JADX INFO: loaded from: classes.dex */
public final class g implements Parcelable.Creator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16424a;

    public /* synthetic */ g(int i7) {
        this.f16424a = i7;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel inParcel) {
        LinkedHashMap linkedHashMap;
        ArrayList arrayList;
        ArrayList arrayList2;
        IResultReceiver iResultReceiver = null;
        switch (this.f16424a) {
            case 0:
                Parcelable parcelable = inParcel.readParcelable(g.class.getClassLoader());
                ObservableParcelable observableParcelable = new ObservableParcelable();
                observableParcelable.f16420b = parcelable;
                return observableParcelable;
            case 1:
                Entry entry = new Entry();
                entry.f22445a = 0.0f;
                entry.f22446b = null;
                entry.f22447c = 0.0f;
                entry.f22447c = inParcel.readFloat();
                entry.f22445a = inParcel.readFloat();
                if (inParcel.readInt() == 1) {
                    entry.f22446b = inParcel.readParcelable(Object.class.getClassLoader());
                }
                return entry;
            case 2:
                Intrinsics.checkNotNullParameter(inParcel, "inParcel");
                return new NavBackStackEntryState(inParcel);
            case 3:
                LoginInfo loginInfo = new LoginInfo();
                loginInfo.f25778a = inParcel.readString();
                loginInfo.f25779b = inParcel.readString();
                loginInfo.f25780c = inParcel.readString();
                loginInfo.f25781d = inParcel.readString();
                return loginInfo;
            case 4:
                ShareItem shareItem = new ShareItem();
                shareItem.f34109a = inParcel.readInt();
                shareItem.f34110b = inParcel.readInt();
                shareItem.f34111c = inParcel.readInt();
                shareItem.f34112d = inParcel.readString();
                shareItem.f34113e = inParcel.readString();
                shareItem.f34114f = inParcel.readString();
                shareItem.f34115g = inParcel.readString();
                shareItem.f34116i = inParcel.readString();
                return shareItem;
            case 5:
                return new ParcelImpl(inParcel);
            case 6:
                Intrinsics.checkNotNullParameter(inParcel, "parcel");
                Intrinsics.checkNotNullParameter(inParcel, "parcel");
                return new ActivityResult(inParcel.readInt(), inParcel.readInt() != 0 ? (Intent) Intent.CREATOR.createFromParcel(inParcel) : null);
            case 7:
                Intrinsics.checkNotNullParameter(inParcel, "inParcel");
                Intrinsics.checkNotNullParameter(inParcel, "parcel");
                Parcelable parcelable2 = inParcel.readParcelable(IntentSender.class.getClassLoader());
                Intrinsics.e(parcelable2);
                return new IntentSenderRequest((IntentSender) parcelable2, (Intent) inParcel.readParcelable(Intent.class.getClassLoader()), inParcel.readInt(), inParcel.readInt());
            case 8:
                boolean z3 = inParcel.readInt() == 1;
                ObservableBoolean observableBoolean = new ObservableBoolean();
                observableBoolean.f16413b = z3;
                return observableBoolean;
            case 9:
                byte b7 = inParcel.readByte();
                ObservableByte observableByte = new ObservableByte();
                observableByte.f16414b = b7;
                return observableByte;
            case 10:
                char c6 = (char) inParcel.readInt();
                ObservableChar observableChar = new ObservableChar();
                observableChar.f16415b = c6;
                return observableChar;
            case 11:
                double d2 = inParcel.readDouble();
                ObservableDouble observableDouble = new ObservableDouble();
                observableDouble.f16416b = d2;
                return observableDouble;
            case 12:
                float f10 = inParcel.readFloat();
                ObservableFloat observableFloat = new ObservableFloat();
                observableFloat.f16417b = f10;
                return observableFloat;
            case 13:
                int i7 = inParcel.readInt();
                ObservableInt observableInt = new ObservableInt();
                observableInt.f16418b = i7;
                return observableInt;
            case 14:
                long j6 = inParcel.readLong();
                ObservableLong observableLong = new ObservableLong();
                observableLong.f16419b = j6;
                return observableLong;
            case 15:
                short s3 = (short) inParcel.readInt();
                ObservableShort observableShort = new ObservableShort();
                observableShort.f16421b = s3;
                return observableShort;
            case 16:
                return new AppSettingsDialog(inParcel);
            case 17:
                ResultReceiver resultReceiver = new ResultReceiver();
                IBinder strongBinder = inParcel.readStrongBinder();
                int i10 = p119i.b.f37392b;
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface(IResultReceiver.f11980h);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IResultReceiver)) {
                        p119i.a aVar = new p119i.a();
                        aVar.f37391a = strongBinder;
                        iResultReceiver = aVar;
                    } else {
                        iResultReceiver = (IResultReceiver) iInterfaceQueryLocalInterface;
                    }
                }
                resultReceiver.f11981a = iResultReceiver;
                return resultReceiver;
            case 18:
                String string = inParcel.readString();
                Parcelable.Creator creator = ParcelFileDescriptor.CREATOR;
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) creator.createFromParcel(inParcel);
                ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) creator.createFromParcel(inParcel);
                String string2 = inParcel.readString();
                if (parcelFileDescriptor == null || parcelFileDescriptor2 == null) {
                    return null;
                }
                return new ParcelableMMKV(string, parcelFileDescriptor.detachFd(), parcelFileDescriptor2.detachFd(), string2);
            case 19:
                return new ContextChain(inParcel);
            case 20:
                Intrinsics.checkNotNullParameter(inParcel, "parcel");
                return new AuthenticationResponse(LivenessConfigResponse.CREATOR.createFromParcel(inParcel));
            case 21:
                Intrinsics.checkNotNullParameter(inParcel, "parcel");
                return new CheckRequest(inParcel.readString(), inParcel.readInt(), inParcel.readInt(), inParcel.readString());
            case 22:
                Intrinsics.checkNotNullParameter(inParcel, "parcel");
                return new CheckResponse(LivenessCheckResponse.CREATOR.createFromParcel(inParcel));
            case 23:
                Intrinsics.checkNotNullParameter(inParcel, "parcel");
                String string3 = inParcel.readString();
                String string4 = inParcel.readString();
                Integer numValueOf = inParcel.readInt() == 0 ? null : Integer.valueOf(inParcel.readInt());
                String string5 = inParcel.readString();
                String string6 = inParcel.readString();
                if (inParcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int i11 = inParcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(i11);
                    for (int i12 = 0; i12 != i11; i12++) {
                        linkedHashMap2.put(inParcel.readString(), inParcel.readString());
                    }
                    linkedHashMap = linkedHashMap2;
                }
                String string7 = inParcel.readString();
                Integer numValueOf2 = inParcel.readInt() == 0 ? null : Integer.valueOf(inParcel.readInt());
                Long lValueOf = inParcel.readInt() == 0 ? null : Long.valueOf(inParcel.readLong());
                int i13 = inParcel.readInt();
                int i14 = inParcel.readInt();
                Integer numValueOf3 = inParcel.readInt() == 0 ? null : Integer.valueOf(inParcel.readInt());
                if (inParcel.readInt() == 0) {
                    arrayList = null;
                } else {
                    int i15 = inParcel.readInt();
                    ArrayList arrayList3 = new ArrayList(i15);
                    for (int i16 = 0; i16 != i15; i16++) {
                        arrayList3.add(LivenessAction.CREATOR.createFromParcel(inParcel));
                    }
                    arrayList = arrayList3;
                }
                if (inParcel.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int i17 = inParcel.readInt();
                    ArrayList arrayList4 = new ArrayList(i17);
                    for (int i18 = 0; i18 != i17; i18++) {
                        arrayList4.add(LivenessAction.CREATOR.createFromParcel(inParcel));
                    }
                    arrayList2 = arrayList4;
                }
                return new ClientConfig(string3, string4, numValueOf, string5, string6, linkedHashMap, string7, numValueOf2, lValueOf, i13, i14, numValueOf3, arrayList, arrayList2, inParcel.readInt() != 0 ? ExtendFeature.CREATOR.createFromParcel(inParcel) : null);
            case 24:
                Intrinsics.checkNotNullParameter(inParcel, "parcel");
                return new ExtendFeature(inParcel.readString(), inParcel.readString(), inParcel.readString(), inParcel.readString(), inParcel.readString());
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                Intrinsics.checkNotNullParameter(inParcel, "parcel");
                return new FacingDetectThreshold(inParcel.readInt() == 0 ? null : Float.valueOf(inParcel.readFloat()), inParcel.readInt() == 0 ? null : Float.valueOf(inParcel.readFloat()), inParcel.readInt() != 0 ? Float.valueOf(inParcel.readFloat()) : null);
            case 26:
                Intrinsics.checkNotNullParameter(inParcel, "parcel");
                return new LiveBaseResponse(inParcel.readString(), inParcel.readString(), inParcel.readString());
            case 27:
                Intrinsics.checkNotNullParameter(inParcel, "parcel");
                return new LivenessAction(inParcel.readString(), inParcel.readString(), inParcel.readInt() != 0);
            case 28:
                Intrinsics.checkNotNullParameter(inParcel, "parcel");
                return new LivenessCheckResponse(inParcel.readString(), inParcel.readString(), inParcel.readString(), inParcel.readString(), inParcel.readString(), inParcel.readString());
            default:
                Intrinsics.checkNotNullParameter(inParcel, "parcel");
                return new LivenessConfigResponse(inParcel.readString(), inParcel.readInt() != 0 ? ClientConfig.CREATOR.createFromParcel(inParcel) : null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i7) {
        switch (this.f16424a) {
            case 0:
                return new ObservableParcelable[i7];
            case 1:
                return new Entry[i7];
            case 2:
                return new NavBackStackEntryState[i7];
            case 3:
                return new LoginInfo[i7];
            case 4:
                return new ShareItem[i7];
            case 5:
                return new ParcelImpl[i7];
            case 6:
                return new ActivityResult[i7];
            case 7:
                return new IntentSenderRequest[i7];
            case 8:
                return new ObservableBoolean[i7];
            case 9:
                return new ObservableByte[i7];
            case 10:
                return new ObservableChar[i7];
            case 11:
                return new ObservableDouble[i7];
            case 12:
                return new ObservableFloat[i7];
            case 13:
                return new ObservableInt[i7];
            case 14:
                return new ObservableLong[i7];
            case 15:
                return new ObservableShort[i7];
            case 16:
                return new AppSettingsDialog[i7];
            case 17:
                return new ResultReceiver[i7];
            case 18:
                return new ParcelableMMKV[i7];
            case 19:
                return new ContextChain[i7];
            case 20:
                return new AuthenticationResponse[i7];
            case 21:
                return new CheckRequest[i7];
            case 22:
                return new CheckResponse[i7];
            case 23:
                return new ClientConfig[i7];
            case 24:
                return new ExtendFeature[i7];
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return new FacingDetectThreshold[i7];
            case 26:
                return new LiveBaseResponse[i7];
            case 27:
                return new LivenessAction[i7];
            case 28:
                return new LivenessCheckResponse[i7];
            default:
                return new LivenessConfigResponse[i7];
        }
    }
}
