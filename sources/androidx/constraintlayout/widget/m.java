package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.material.navigation.NavigationBarView;
import com.google.api.Service;
import com.google.protobuf.DescriptorProtos;
import com.luck.picture.lib.config.PictureConfig;
import com.transsnet.palmpay.bean.HomeDialogState;
import com.transsnet.palmpay.core.bean.rsp.HomeMenuBean;
import com.transsnet.palmpay.core.config.BillBusinessType;
import com.transsnet.palmpay.core.dialog.ShareDialog;
import com.transsnet.palmpay.send_money.ui.dialog.kkcar.KkCarPayResultDialog;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f15850g = {0, 4, 8};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final SparseIntArray f15851h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final SparseIntArray f15852i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15854b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15855c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f15856d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15857e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f15858f = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f15851h = sparseIntArray;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f15852i = sparseIntArray2;
        sparseIntArray.append(p.Constraint_layout_constraintLeft_toLeftOf, 25);
        sparseIntArray.append(p.Constraint_layout_constraintLeft_toRightOf, 26);
        sparseIntArray.append(p.Constraint_layout_constraintRight_toLeftOf, 29);
        sparseIntArray.append(p.Constraint_layout_constraintRight_toRightOf, 30);
        sparseIntArray.append(p.Constraint_layout_constraintTop_toTopOf, 36);
        sparseIntArray.append(p.Constraint_layout_constraintTop_toBottomOf, 35);
        sparseIntArray.append(p.Constraint_layout_constraintBottom_toTopOf, 4);
        sparseIntArray.append(p.Constraint_layout_constraintBottom_toBottomOf, 3);
        sparseIntArray.append(p.Constraint_layout_constraintBaseline_toBaselineOf, 1);
        sparseIntArray.append(p.Constraint_layout_constraintBaseline_toTopOf, 91);
        sparseIntArray.append(p.Constraint_layout_constraintBaseline_toBottomOf, 92);
        sparseIntArray.append(p.Constraint_layout_editor_absoluteX, 6);
        sparseIntArray.append(p.Constraint_layout_editor_absoluteY, 7);
        sparseIntArray.append(p.Constraint_layout_constraintGuide_begin, 17);
        sparseIntArray.append(p.Constraint_layout_constraintGuide_end, 18);
        sparseIntArray.append(p.Constraint_layout_constraintGuide_percent, 19);
        sparseIntArray.append(p.Constraint_guidelineUseRtl, 99);
        sparseIntArray.append(p.Constraint_android_orientation, 27);
        sparseIntArray.append(p.Constraint_layout_constraintStart_toEndOf, 32);
        sparseIntArray.append(p.Constraint_layout_constraintStart_toStartOf, 33);
        sparseIntArray.append(p.Constraint_layout_constraintEnd_toStartOf, 10);
        sparseIntArray.append(p.Constraint_layout_constraintEnd_toEndOf, 9);
        sparseIntArray.append(p.Constraint_layout_goneMarginLeft, 13);
        sparseIntArray.append(p.Constraint_layout_goneMarginTop, 16);
        sparseIntArray.append(p.Constraint_layout_goneMarginRight, 14);
        sparseIntArray.append(p.Constraint_layout_goneMarginBottom, 11);
        sparseIntArray.append(p.Constraint_layout_goneMarginStart, 15);
        sparseIntArray.append(p.Constraint_layout_goneMarginEnd, 12);
        sparseIntArray.append(p.Constraint_layout_constraintVertical_weight, 40);
        sparseIntArray.append(p.Constraint_layout_constraintHorizontal_weight, 39);
        sparseIntArray.append(p.Constraint_layout_constraintHorizontal_chainStyle, 41);
        sparseIntArray.append(p.Constraint_layout_constraintVertical_chainStyle, 42);
        sparseIntArray.append(p.Constraint_layout_constraintHorizontal_bias, 20);
        sparseIntArray.append(p.Constraint_layout_constraintVertical_bias, 37);
        sparseIntArray.append(p.Constraint_layout_constraintDimensionRatio, 5);
        sparseIntArray.append(p.Constraint_layout_constraintLeft_creator, 87);
        sparseIntArray.append(p.Constraint_layout_constraintTop_creator, 87);
        sparseIntArray.append(p.Constraint_layout_constraintRight_creator, 87);
        sparseIntArray.append(p.Constraint_layout_constraintBottom_creator, 87);
        sparseIntArray.append(p.Constraint_layout_constraintBaseline_creator, 87);
        sparseIntArray.append(p.Constraint_android_layout_marginLeft, 24);
        sparseIntArray.append(p.Constraint_android_layout_marginRight, 28);
        sparseIntArray.append(p.Constraint_android_layout_marginStart, 31);
        sparseIntArray.append(p.Constraint_android_layout_marginEnd, 8);
        sparseIntArray.append(p.Constraint_android_layout_marginTop, 34);
        sparseIntArray.append(p.Constraint_android_layout_marginBottom, 2);
        sparseIntArray.append(p.Constraint_android_layout_width, 23);
        sparseIntArray.append(p.Constraint_android_layout_height, 21);
        sparseIntArray.append(p.Constraint_layout_constraintWidth, 95);
        sparseIntArray.append(p.Constraint_layout_constraintHeight, 96);
        sparseIntArray.append(p.Constraint_android_visibility, 22);
        sparseIntArray.append(p.Constraint_android_alpha, 43);
        sparseIntArray.append(p.Constraint_android_elevation, 44);
        sparseIntArray.append(p.Constraint_android_rotationX, 45);
        sparseIntArray.append(p.Constraint_android_rotationY, 46);
        sparseIntArray.append(p.Constraint_android_rotation, 60);
        sparseIntArray.append(p.Constraint_android_scaleX, 47);
        sparseIntArray.append(p.Constraint_android_scaleY, 48);
        sparseIntArray.append(p.Constraint_android_transformPivotX, 49);
        sparseIntArray.append(p.Constraint_android_transformPivotY, 50);
        sparseIntArray.append(p.Constraint_android_translationX, 51);
        sparseIntArray.append(p.Constraint_android_translationY, 52);
        sparseIntArray.append(p.Constraint_android_translationZ, 53);
        sparseIntArray.append(p.Constraint_layout_constraintWidth_default, 54);
        sparseIntArray.append(p.Constraint_layout_constraintHeight_default, 55);
        sparseIntArray.append(p.Constraint_layout_constraintWidth_max, 56);
        sparseIntArray.append(p.Constraint_layout_constraintHeight_max, 57);
        sparseIntArray.append(p.Constraint_layout_constraintWidth_min, 58);
        sparseIntArray.append(p.Constraint_layout_constraintHeight_min, 59);
        sparseIntArray.append(p.Constraint_layout_constraintCircle, 61);
        sparseIntArray.append(p.Constraint_layout_constraintCircleRadius, 62);
        sparseIntArray.append(p.Constraint_layout_constraintCircleAngle, 63);
        sparseIntArray.append(p.Constraint_animateRelativeTo, 64);
        sparseIntArray.append(p.Constraint_transitionEasing, 65);
        sparseIntArray.append(p.Constraint_drawPath, 66);
        sparseIntArray.append(p.Constraint_transitionPathRotate, 67);
        sparseIntArray.append(p.Constraint_motionStagger, 79);
        sparseIntArray.append(p.Constraint_android_id, 38);
        sparseIntArray.append(p.Constraint_motionProgress, 68);
        sparseIntArray.append(p.Constraint_layout_constraintWidth_percent, 69);
        sparseIntArray.append(p.Constraint_layout_constraintHeight_percent, 70);
        sparseIntArray.append(p.Constraint_layout_wrapBehaviorInParent, 97);
        sparseIntArray.append(p.Constraint_chainUseRtl, 71);
        sparseIntArray.append(p.Constraint_barrierDirection, 72);
        sparseIntArray.append(p.Constraint_barrierMargin, 73);
        sparseIntArray.append(p.Constraint_constraint_referenced_ids, 74);
        sparseIntArray.append(p.Constraint_barrierAllowsGoneWidgets, 75);
        sparseIntArray.append(p.Constraint_pathMotionArc, 76);
        sparseIntArray.append(p.Constraint_layout_constraintTag, 77);
        sparseIntArray.append(p.Constraint_visibilityMode, 78);
        sparseIntArray.append(p.Constraint_layout_constrainedWidth, 80);
        sparseIntArray.append(p.Constraint_layout_constrainedHeight, 81);
        sparseIntArray.append(p.Constraint_polarRelativeTo, 82);
        sparseIntArray.append(p.Constraint_transformPivotTarget, 83);
        sparseIntArray.append(p.Constraint_quantizeMotionSteps, 84);
        sparseIntArray.append(p.Constraint_quantizeMotionPhase, 85);
        sparseIntArray.append(p.Constraint_quantizeMotionInterpolator, 86);
        sparseIntArray2.append(p.ConstraintOverride_layout_editor_absoluteY, 6);
        sparseIntArray2.append(p.ConstraintOverride_layout_editor_absoluteY, 7);
        sparseIntArray2.append(p.ConstraintOverride_android_orientation, 27);
        sparseIntArray2.append(p.ConstraintOverride_layout_goneMarginLeft, 13);
        sparseIntArray2.append(p.ConstraintOverride_layout_goneMarginTop, 16);
        sparseIntArray2.append(p.ConstraintOverride_layout_goneMarginRight, 14);
        sparseIntArray2.append(p.ConstraintOverride_layout_goneMarginBottom, 11);
        sparseIntArray2.append(p.ConstraintOverride_layout_goneMarginStart, 15);
        sparseIntArray2.append(p.ConstraintOverride_layout_goneMarginEnd, 12);
        sparseIntArray2.append(p.ConstraintOverride_layout_constraintVertical_weight, 40);
        sparseIntArray2.append(p.ConstraintOverride_layout_constraintHorizontal_weight, 39);
        sparseIntArray2.append(p.ConstraintOverride_layout_constraintHorizontal_chainStyle, 41);
        sparseIntArray2.append(p.ConstraintOverride_layout_constraintVertical_chainStyle, 42);
        sparseIntArray2.append(p.ConstraintOverride_layout_constraintHorizontal_bias, 20);
        sparseIntArray2.append(p.ConstraintOverride_layout_constraintVertical_bias, 37);
        sparseIntArray2.append(p.ConstraintOverride_layout_constraintDimensionRatio, 5);
        sparseIntArray2.append(p.ConstraintOverride_layout_constraintLeft_creator, 87);
        sparseIntArray2.append(p.ConstraintOverride_layout_constraintTop_creator, 87);
        sparseIntArray2.append(p.ConstraintOverride_layout_constraintRight_creator, 87);
        sparseIntArray2.append(p.ConstraintOverride_layout_constraintBottom_creator, 87);
        sparseIntArray2.append(p.ConstraintOverride_layout_constraintBaseline_creator, 87);
        sparseIntArray2.append(p.ConstraintOverride_android_layout_marginLeft, 24);
        sparseIntArray2.append(p.ConstraintOverride_android_layout_marginRight, 28);
        sparseIntArray2.append(p.ConstraintOverride_android_layout_marginStart, 31);
        sparseIntArray2.append(p.ConstraintOverride_android_layout_marginEnd, 8);
        sparseIntArray2.append(p.ConstraintOverride_android_layout_marginTop, 34);
        sparseIntArray2.append(p.ConstraintOverride_android_layout_marginBottom, 2);
        sparseIntArray2.append(p.ConstraintOverride_android_layout_width, 23);
        sparseIntArray2.append(p.ConstraintOverride_android_layout_height, 21);
        sparseIntArray2.append(p.ConstraintOverride_layout_constraintWidth, 95);
        sparseIntArray2.append(p.ConstraintOverride_layout_constraintHeight, 96);
        sparseIntArray2.append(p.ConstraintOverride_android_visibility, 22);
        sparseIntArray2.append(p.ConstraintOverride_android_alpha, 43);
        sparseIntArray2.append(p.ConstraintOverride_android_elevation, 44);
        sparseIntArray2.append(p.ConstraintOverride_android_rotationX, 45);
        sparseIntArray2.append(p.ConstraintOverride_android_rotationY, 46);
        sparseIntArray2.append(p.ConstraintOverride_android_rotation, 60);
        sparseIntArray2.append(p.ConstraintOverride_android_scaleX, 47);
        sparseIntArray2.append(p.ConstraintOverride_android_scaleY, 48);
        sparseIntArray2.append(p.ConstraintOverride_android_transformPivotX, 49);
        sparseIntArray2.append(p.ConstraintOverride_android_transformPivotY, 50);
        sparseIntArray2.append(p.ConstraintOverride_android_translationX, 51);
        sparseIntArray2.append(p.ConstraintOverride_android_translationY, 52);
        sparseIntArray2.append(p.ConstraintOverride_android_translationZ, 53);
        sparseIntArray2.append(p.ConstraintOverride_layout_constraintWidth_default, 54);
        sparseIntArray2.append(p.ConstraintOverride_layout_constraintHeight_default, 55);
        sparseIntArray2.append(p.ConstraintOverride_layout_constraintWidth_max, 56);
        sparseIntArray2.append(p.ConstraintOverride_layout_constraintHeight_max, 57);
        sparseIntArray2.append(p.ConstraintOverride_layout_constraintWidth_min, 58);
        sparseIntArray2.append(p.ConstraintOverride_layout_constraintHeight_min, 59);
        sparseIntArray2.append(p.ConstraintOverride_layout_constraintCircleRadius, 62);
        sparseIntArray2.append(p.ConstraintOverride_layout_constraintCircleAngle, 63);
        sparseIntArray2.append(p.ConstraintOverride_animateRelativeTo, 64);
        sparseIntArray2.append(p.ConstraintOverride_transitionEasing, 65);
        sparseIntArray2.append(p.ConstraintOverride_drawPath, 66);
        sparseIntArray2.append(p.ConstraintOverride_transitionPathRotate, 67);
        sparseIntArray2.append(p.ConstraintOverride_motionStagger, 79);
        sparseIntArray2.append(p.ConstraintOverride_android_id, 38);
        sparseIntArray2.append(p.ConstraintOverride_motionTarget, 98);
        sparseIntArray2.append(p.ConstraintOverride_motionProgress, 68);
        sparseIntArray2.append(p.ConstraintOverride_layout_constraintWidth_percent, 69);
        sparseIntArray2.append(p.ConstraintOverride_layout_constraintHeight_percent, 70);
        sparseIntArray2.append(p.ConstraintOverride_chainUseRtl, 71);
        sparseIntArray2.append(p.ConstraintOverride_barrierDirection, 72);
        sparseIntArray2.append(p.ConstraintOverride_barrierMargin, 73);
        sparseIntArray2.append(p.ConstraintOverride_constraint_referenced_ids, 74);
        sparseIntArray2.append(p.ConstraintOverride_barrierAllowsGoneWidgets, 75);
        sparseIntArray2.append(p.ConstraintOverride_pathMotionArc, 76);
        sparseIntArray2.append(p.ConstraintOverride_layout_constraintTag, 77);
        sparseIntArray2.append(p.ConstraintOverride_visibilityMode, 78);
        sparseIntArray2.append(p.ConstraintOverride_layout_constrainedWidth, 80);
        sparseIntArray2.append(p.ConstraintOverride_layout_constrainedHeight, 81);
        sparseIntArray2.append(p.ConstraintOverride_polarRelativeTo, 82);
        sparseIntArray2.append(p.ConstraintOverride_transformPivotTarget, 83);
        sparseIntArray2.append(p.ConstraintOverride_quantizeMotionSteps, 84);
        sparseIntArray2.append(p.ConstraintOverride_quantizeMotionPhase, 85);
        sparseIntArray2.append(p.ConstraintOverride_quantizeMotionInterpolator, 86);
        sparseIntArray2.append(p.ConstraintOverride_layout_wrapBehaviorInParent, 97);
    }

    public static h d(Context context, XmlResourceParser xmlResourceParser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        h hVar = new h();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, p.ConstraintOverride);
        r(hVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return hVar;
    }

    public static int[] i(Barrier barrier, String str) {
        int iIntValue;
        Object designInformation;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i7 = 0;
        int i10 = 0;
        while (i7 < strArrSplit.length) {
            String strTrim = strArrSplit[i7].trim();
            try {
                iIntValue = o.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) barrier.getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof Integer)) {
                iIntValue = ((Integer) designInformation).intValue();
            }
            iArr[i10] = iIntValue;
            i7++;
            i10++;
        }
        return i10 != strArrSplit.length ? Arrays.copyOf(iArr, i10) : iArr;
    }

    public static h j(Context context, AttributeSet attributeSet, boolean z3) {
        h hVar = new h();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z3 ? p.ConstraintOverride : p.Constraint);
        if (z3) {
            r(hVar, typedArrayObtainStyledAttributes);
        } else {
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            int i7 = 0;
            while (true) {
                i iVar = hVar.f15747e;
                if (i7 < indexCount) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i7);
                    int i10 = p.Constraint_android_id;
                    k kVar = hVar.f15745c;
                    l lVar = hVar.f15748f;
                    j jVar = hVar.f15746d;
                    if (index != i10 && p.Constraint_android_layout_marginStart != index && p.Constraint_android_layout_marginEnd != index) {
                        jVar.f15817a = true;
                        iVar.f15780b = true;
                        kVar.f15830a = true;
                        lVar.f15836a = true;
                    }
                    SparseIntArray sparseIntArray = f15851h;
                    switch (sparseIntArray.get(index)) {
                        case 1:
                            iVar.f15807q = o(typedArrayObtainStyledAttributes, index, iVar.f15807q);
                            break;
                        case 2:
                            iVar.f15761J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f15761J);
                            break;
                        case 3:
                            iVar.f15805p = o(typedArrayObtainStyledAttributes, index, iVar.f15805p);
                            break;
                        case 4:
                            iVar.f15803o = o(typedArrayObtainStyledAttributes, index, iVar.f15803o);
                            break;
                        case 5:
                            iVar.f15815z = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            iVar.f15755D = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, iVar.f15755D);
                            break;
                        case 7:
                            iVar.f15756E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, iVar.f15756E);
                            break;
                        case 8:
                            iVar.f15762K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f15762K);
                            break;
                        case 9:
                            iVar.f15812w = o(typedArrayObtainStyledAttributes, index, iVar.f15812w);
                            break;
                        case 10:
                            iVar.f15811v = o(typedArrayObtainStyledAttributes, index, iVar.f15811v);
                            break;
                        case 11:
                            iVar.f15768Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f15768Q);
                            break;
                        case 12:
                            iVar.f15769R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f15769R);
                            break;
                        case 13:
                            iVar.f15765N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f15765N);
                            break;
                        case 14:
                            iVar.f15767P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f15767P);
                            break;
                        case 15:
                            iVar.f15770S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f15770S);
                            break;
                        case 16:
                            iVar.f15766O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f15766O);
                            break;
                        case 17:
                            iVar.f15784e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, iVar.f15784e);
                            break;
                        case 18:
                            iVar.f15786f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, iVar.f15786f);
                            break;
                        case 19:
                            iVar.f15788g = typedArrayObtainStyledAttributes.getFloat(index, iVar.f15788g);
                            break;
                        case 20:
                            iVar.f15813x = typedArrayObtainStyledAttributes.getFloat(index, iVar.f15813x);
                            break;
                        case 21:
                            iVar.f15782d = typedArrayObtainStyledAttributes.getLayoutDimension(index, iVar.f15782d);
                            break;
                        case 22:
                            int i11 = typedArrayObtainStyledAttributes.getInt(index, kVar.f15831b);
                            kVar.f15831b = i11;
                            kVar.f15831b = f15850g[i11];
                            break;
                        case 23:
                            iVar.f15781c = typedArrayObtainStyledAttributes.getLayoutDimension(index, iVar.f15781c);
                            break;
                        case 24:
                            iVar.f15758G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f15758G);
                            break;
                        case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                            iVar.f15792i = o(typedArrayObtainStyledAttributes, index, iVar.f15792i);
                            break;
                        case 26:
                            iVar.f15793j = o(typedArrayObtainStyledAttributes, index, iVar.f15793j);
                            break;
                        case 27:
                            iVar.f15757F = typedArrayObtainStyledAttributes.getInt(index, iVar.f15757F);
                            break;
                        case 28:
                            iVar.f15759H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f15759H);
                            break;
                        case 29:
                            iVar.f15795k = o(typedArrayObtainStyledAttributes, index, iVar.f15795k);
                            break;
                        case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
                            iVar.f15797l = o(typedArrayObtainStyledAttributes, index, iVar.f15797l);
                            break;
                        case 31:
                            iVar.f15763L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f15763L);
                            break;
                        case 32:
                            iVar.t = o(typedArrayObtainStyledAttributes, index, iVar.t);
                            break;
                        case 33:
                            iVar.f15810u = o(typedArrayObtainStyledAttributes, index, iVar.f15810u);
                            break;
                        case 34:
                            iVar.f15760I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f15760I);
                            break;
                        case 35:
                            iVar.f15801n = o(typedArrayObtainStyledAttributes, index, iVar.f15801n);
                            break;
                        case 36:
                            iVar.f15799m = o(typedArrayObtainStyledAttributes, index, iVar.f15799m);
                            break;
                        case 37:
                            iVar.f15814y = typedArrayObtainStyledAttributes.getFloat(index, iVar.f15814y);
                            break;
                        case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
                            hVar.f15743a = typedArrayObtainStyledAttributes.getResourceId(index, hVar.f15743a);
                            break;
                        case 39:
                            iVar.f15773V = typedArrayObtainStyledAttributes.getFloat(index, iVar.f15773V);
                            break;
                        case 40:
                            iVar.f15772U = typedArrayObtainStyledAttributes.getFloat(index, iVar.f15772U);
                            break;
                        case 41:
                            iVar.f15774W = typedArrayObtainStyledAttributes.getInt(index, iVar.f15774W);
                            break;
                        case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                            iVar.f15775X = typedArrayObtainStyledAttributes.getInt(index, iVar.f15775X);
                            break;
                        case 43:
                            kVar.f15833d = typedArrayObtainStyledAttributes.getFloat(index, kVar.f15833d);
                            break;
                        case 44:
                            lVar.f15848m = true;
                            lVar.f15849n = typedArrayObtainStyledAttributes.getDimension(index, lVar.f15849n);
                            break;
                        case 45:
                            lVar.f15838c = typedArrayObtainStyledAttributes.getFloat(index, lVar.f15838c);
                            break;
                        case 46:
                            lVar.f15839d = typedArrayObtainStyledAttributes.getFloat(index, lVar.f15839d);
                            break;
                        case ShareDialog.SHARE_BUSINESS_TYPE_JUNE_INVITE_TASK /* 47 */:
                            lVar.f15840e = typedArrayObtainStyledAttributes.getFloat(index, lVar.f15840e);
                            break;
                        case 48:
                            lVar.f15841f = typedArrayObtainStyledAttributes.getFloat(index, lVar.f15841f);
                            break;
                        case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                            lVar.f15842g = typedArrayObtainStyledAttributes.getDimension(index, lVar.f15842g);
                            break;
                        case 50:
                            lVar.f15843h = typedArrayObtainStyledAttributes.getDimension(index, lVar.f15843h);
                            break;
                        case 51:
                            lVar.f15845j = typedArrayObtainStyledAttributes.getDimension(index, lVar.f15845j);
                            break;
                        case 52:
                            lVar.f15846k = typedArrayObtainStyledAttributes.getDimension(index, lVar.f15846k);
                            break;
                        case 53:
                            lVar.f15847l = typedArrayObtainStyledAttributes.getDimension(index, lVar.f15847l);
                            break;
                        case 54:
                            iVar.f15776Y = typedArrayObtainStyledAttributes.getInt(index, iVar.f15776Y);
                            break;
                        case 55:
                            iVar.f15777Z = typedArrayObtainStyledAttributes.getInt(index, iVar.f15777Z);
                            break;
                        case 56:
                            iVar.f15779a0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f15779a0);
                            break;
                        case 57:
                            iVar.b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.b0);
                            break;
                        case 58:
                            iVar.c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.c0);
                            break;
                        case 59:
                            iVar.f15783d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f15783d0);
                            break;
                        case PictureConfig.MAX_PAGE_SIZE /* 60 */:
                            lVar.f15837b = typedArrayObtainStyledAttributes.getFloat(index, lVar.f15837b);
                            break;
                        case HomeMenuBean.BOTTOM_TAB_HOME /* 61 */:
                            iVar.f15752A = o(typedArrayObtainStyledAttributes, index, iVar.f15752A);
                            break;
                        case HomeMenuBean.BOTTOM_TAB_ME /* 62 */:
                            iVar.f15753B = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f15753B);
                            break;
                        case HomeMenuBean.BOTTOM_TAB_FINANCE /* 63 */:
                            iVar.f15754C = typedArrayObtainStyledAttributes.getFloat(index, iVar.f15754C);
                            break;
                        case 64:
                            jVar.f15818b = o(typedArrayObtainStyledAttributes, index, jVar.f15818b);
                            break;
                        case HomeMenuBean.BOTTOM_TAB_INVEST /* 65 */:
                            if (typedArrayObtainStyledAttributes.peekValue(index).type != 3) {
                                jVar.f15820d = O.e.f6488d[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                            } else {
                                jVar.f15820d = typedArrayObtainStyledAttributes.getString(index);
                            }
                            break;
                        case HomeMenuBean.BOTTOM_TAB_GIVEAWAY /* 66 */:
                            jVar.f15822f = typedArrayObtainStyledAttributes.getInt(index, 0);
                            break;
                        case 67:
                            jVar.f15824h = typedArrayObtainStyledAttributes.getFloat(index, jVar.f15824h);
                            break;
                        case 68:
                            kVar.f15834e = typedArrayObtainStyledAttributes.getFloat(index, kVar.f15834e);
                            break;
                        case 69:
                            iVar.f15785e0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 70:
                            iVar.f15787f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                            break;
                        case 71:
                            Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                            break;
                        case KkCarPayResultDialog.SUCCESS_TITLE_MARGIN_TOP_DP /* 72 */:
                            iVar.f15789g0 = typedArrayObtainStyledAttributes.getInt(index, iVar.f15789g0);
                            break;
                        case 73:
                            iVar.f15791h0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f15791h0);
                            break;
                        case 74:
                            iVar.f15796k0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 75:
                            iVar.f15804o0 = typedArrayObtainStyledAttributes.getBoolean(index, iVar.f15804o0);
                            break;
                        case 76:
                            jVar.f15821e = typedArrayObtainStyledAttributes.getInt(index, jVar.f15821e);
                            break;
                        case 77:
                            iVar.f15798l0 = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 78:
                            kVar.f15832c = typedArrayObtainStyledAttributes.getInt(index, kVar.f15832c);
                            break;
                        case 79:
                            jVar.f15823g = typedArrayObtainStyledAttributes.getFloat(index, jVar.f15823g);
                            break;
                        case 80:
                            iVar.f15800m0 = typedArrayObtainStyledAttributes.getBoolean(index, iVar.f15800m0);
                            break;
                        case 81:
                            iVar.f15802n0 = typedArrayObtainStyledAttributes.getBoolean(index, iVar.f15802n0);
                            break;
                        case 82:
                            jVar.f15819c = typedArrayObtainStyledAttributes.getInteger(index, jVar.f15819c);
                            break;
                        case 83:
                            lVar.f15844i = o(typedArrayObtainStyledAttributes, index, lVar.f15844i);
                            break;
                        case 84:
                            jVar.f15826j = typedArrayObtainStyledAttributes.getInteger(index, jVar.f15826j);
                            break;
                        case 85:
                            jVar.f15825i = typedArrayObtainStyledAttributes.getFloat(index, jVar.f15825i);
                            break;
                        case 86:
                            int i12 = typedArrayObtainStyledAttributes.peekValue(index).type;
                            if (i12 == 1) {
                                int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                jVar.f15829m = resourceId;
                                if (resourceId != -1) {
                                    jVar.f15828l = -2;
                                }
                            } else if (i12 != 3) {
                                jVar.f15828l = typedArrayObtainStyledAttributes.getInteger(index, jVar.f15829m);
                            } else {
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                jVar.f15827k = string;
                                if (string.indexOf("/") <= 0) {
                                    jVar.f15828l = -1;
                                } else {
                                    jVar.f15829m = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                    jVar.f15828l = -2;
                                }
                            }
                            break;
                        case 87:
                            Integer.toHexString(index);
                            sparseIntArray.get(index);
                            break;
                        case 88:
                        case 89:
                        case 90:
                        default:
                            Integer.toHexString(index);
                            sparseIntArray.get(index);
                            break;
                        case 91:
                            iVar.f15808r = o(typedArrayObtainStyledAttributes, index, iVar.f15808r);
                            break;
                        case HomeDialogState.PRIORITY_CONFIRM_UTILITY_NOTIFICATION_DIALOG /* 92 */:
                            iVar.f15809s = o(typedArrayObtainStyledAttributes, index, iVar.f15809s);
                            break;
                        case HomeDialogState.PRIORITY_OK_CARD_DIALOG /* 93 */:
                            iVar.f15764M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f15764M);
                            break;
                        case 94:
                            iVar.f15771T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, iVar.f15771T);
                            break;
                        case HomeDialogState.PRIORITY_AD_DIALOG /* 95 */:
                            p(iVar, typedArrayObtainStyledAttributes, index, 0);
                            break;
                        case 96:
                            p(iVar, typedArrayObtainStyledAttributes, index, 1);
                            break;
                        case 97:
                            iVar.f15806p0 = typedArrayObtainStyledAttributes.getInt(index, iVar.f15806p0);
                            break;
                    }
                    i7++;
                } else if (iVar.f15796k0 != null) {
                    iVar.f15794j0 = null;
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return hVar;
    }

    public static int o(TypedArray typedArray, int i7, int i10) {
        int resourceId = typedArray.getResourceId(i7, i10);
        return resourceId == -1 ? typedArray.getInt(i7, -1) : resourceId;
    }

    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:24:0x003f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0044  */
    /* JADX WARN: Code duplicated, block: B:28:0x0048  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0051  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x005e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0067  */
    public static void p(Object obj, TypedArray typedArray, int i7, int i10) {
        int dimensionPixelSize;
        g gVar;
        i iVar;
        ConstraintLayout.LayoutParams layoutParams;
        if (obj == null) {
            return;
        }
        int i11 = typedArray.peekValue(i7).type;
        boolean z3 = true;
        int i12 = 0;
        if (i11 != 3) {
            if (i11 != 5) {
                dimensionPixelSize = typedArray.getInt(i7, 0);
                if (dimensionPixelSize == -4) {
                    i12 = -2;
                } else if (dimensionPixelSize == -3 || (dimensionPixelSize != -2 && dimensionPixelSize != -1)) {
                    z3 = false;
                }
                if (obj instanceof ConstraintLayout.LayoutParams) {
                    layoutParams = (ConstraintLayout.LayoutParams) obj;
                    if (i10 == 0) {
                        ((ViewGroup.MarginLayoutParams) layoutParams).width = i12;
                        layoutParams.f15632W = z3;
                        return;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams).height = i12;
                        layoutParams.f15633X = z3;
                        return;
                    }
                }
                if (obj instanceof i) {
                    iVar = (i) obj;
                    if (i10 == 0) {
                        iVar.f15781c = i12;
                        iVar.f15800m0 = z3;
                        return;
                    } else {
                        iVar.f15782d = i12;
                        iVar.f15802n0 = z3;
                        return;
                    }
                }
                if (obj instanceof g) {
                    gVar = (g) obj;
                    if (i10 == 0) {
                        gVar.b(23, i12);
                        gVar.d(80, z3);
                        return;
                    } else {
                        gVar.b(21, i12);
                        gVar.d(81, z3);
                        return;
                    }
                }
                return;
            }
            dimensionPixelSize = typedArray.getDimensionPixelSize(i7, 0);
            z3 = false;
            i12 = dimensionPixelSize;
            if (obj instanceof ConstraintLayout.LayoutParams) {
                layoutParams = (ConstraintLayout.LayoutParams) obj;
                if (i10 == 0) {
                    ((ViewGroup.MarginLayoutParams) layoutParams).width = i12;
                    layoutParams.f15632W = z3;
                    return;
                } else {
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = i12;
                    layoutParams.f15633X = z3;
                    return;
                }
            }
            if (obj instanceof i) {
                iVar = (i) obj;
                if (i10 == 0) {
                    iVar.f15781c = i12;
                    iVar.f15800m0 = z3;
                    return;
                } else {
                    iVar.f15782d = i12;
                    iVar.f15802n0 = z3;
                    return;
                }
            }
            if (obj instanceof g) {
                gVar = (g) obj;
                if (i10 == 0) {
                    gVar.b(23, i12);
                    gVar.d(80, z3);
                    return;
                } else {
                    gVar.b(21, i12);
                    gVar.d(81, z3);
                    return;
                }
            }
            return;
        }
        String string = typedArray.getString(i7);
        if (string == null) {
            return;
        }
        int iIndexOf = string.indexOf(61);
        int length = string.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = string.substring(0, iIndexOf);
        String strSubstring2 = string.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.LayoutParams) {
                    ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) obj;
                    if (i10 == 0) {
                        ((ViewGroup.MarginLayoutParams) layoutParams2).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) layoutParams2).height = 0;
                    }
                    q(layoutParams2, strTrim2);
                    return;
                }
                if (obj instanceof i) {
                    ((i) obj).f15815z = strTrim2;
                    return;
                } else {
                    if (obj instanceof g) {
                        ((g) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f10 = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).width = 0;
                            layoutParams3.f15617H = f10;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams3).height = 0;
                            layoutParams3.f15618I = f10;
                            return;
                        }
                    }
                    if (obj instanceof i) {
                        i iVar2 = (i) obj;
                        if (i10 == 0) {
                            iVar2.f15781c = 0;
                            iVar2.f15773V = f10;
                            return;
                        } else {
                            iVar2.f15782d = 0;
                            iVar2.f15772U = f10;
                            return;
                        }
                    }
                    if (obj instanceof g) {
                        g gVar2 = (g) obj;
                        if (i10 == 0) {
                            gVar2.b(23, 0);
                            gVar2.a(39, f10);
                            return;
                        } else {
                            gVar2.b(21, 0);
                            gVar2.a(40, f10);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams4 = (ConstraintLayout.LayoutParams) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) layoutParams4).width = 0;
                            layoutParams4.f15627R = fMax;
                            layoutParams4.f15621L = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) layoutParams4).height = 0;
                            layoutParams4.f15628S = fMax;
                            layoutParams4.f15622M = 2;
                            return;
                        }
                    }
                    if (obj instanceof i) {
                        i iVar3 = (i) obj;
                        if (i10 == 0) {
                            iVar3.f15781c = 0;
                            iVar3.f15785e0 = fMax;
                            iVar3.f15776Y = 2;
                            return;
                        } else {
                            iVar3.f15782d = 0;
                            iVar3.f15787f0 = fMax;
                            iVar3.f15777Z = 2;
                            return;
                        }
                    }
                    if (obj instanceof g) {
                        g gVar3 = (g) obj;
                        if (i10 == 0) {
                            gVar3.b(23, 0);
                            gVar3.b(54, 2);
                        } else {
                            gVar3.b(21, 0);
                            gVar3.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    public static void q(ConstraintLayout.LayoutParams layoutParams, String str) {
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i7 = 0;
            int i10 = -1;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (!strSubstring.equalsIgnoreCase("W")) {
                    i7 = strSubstring.equalsIgnoreCase("H") ? 1 : -1;
                }
                i10 = i7;
                i7 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i7);
                    if (strSubstring2.length() > 0) {
                        Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i7, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f10 = Float.parseFloat(strSubstring3);
                        float f11 = Float.parseFloat(strSubstring4);
                        if (f10 > 0.0f && f11 > 0.0f) {
                            if (i10 == 1) {
                                Math.abs(f11 / f10);
                            } else {
                                Math.abs(f10 / f11);
                            }
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        layoutParams.f15616G = str;
    }

    public static void r(h hVar, TypedArray typedArray) {
        char c6;
        int indexCount = typedArray.getIndexCount();
        g gVar = new g();
        gVar.f15731a = new int[10];
        gVar.f15732b = new int[10];
        int i7 = 0;
        gVar.f15733c = 0;
        gVar.f15734d = new int[10];
        gVar.f15735e = new float[10];
        gVar.f15736f = 0;
        gVar.f15737g = new int[5];
        gVar.f15738h = new String[5];
        gVar.f15739i = 0;
        gVar.f15740j = new int[4];
        gVar.f15741k = new boolean[4];
        gVar.f15742l = 0;
        hVar.f15750h = gVar;
        j jVar = hVar.f15746d;
        jVar.f15817a = false;
        i iVar = hVar.f15747e;
        iVar.f15780b = false;
        k kVar = hVar.f15745c;
        kVar.f15830a = false;
        l lVar = hVar.f15748f;
        lVar.f15836a = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            int i11 = f15852i.get(index);
            SparseIntArray sparseIntArray = f15851h;
            switch (i11) {
                case 2:
                    c6 = 5;
                    gVar.b(2, typedArray.getDimensionPixelSize(index, iVar.f15761J));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                case 26:
                case 29:
                case BillBusinessType.BUSINESS_TYPE_COMMERCE_RETAIL_TRADE_PAYMENTS /* 30 */:
                case 32:
                case 33:
                case 35:
                case 36:
                case HomeMenuBean.BOTTOM_TAB_HOME /* 61 */:
                case 88:
                case 89:
                case 90:
                case 91:
                case HomeDialogState.PRIORITY_CONFIRM_UTILITY_NOTIFICATION_DIALOG /* 92 */:
                default:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    c6 = 5;
                    break;
                case 5:
                    c6 = 5;
                    gVar.c(5, typedArray.getString(index));
                    break;
                case 6:
                    gVar.b(6, typedArray.getDimensionPixelOffset(index, iVar.f15755D));
                    c6 = 5;
                    break;
                case 7:
                    gVar.b(7, typedArray.getDimensionPixelOffset(index, iVar.f15756E));
                    c6 = 5;
                    break;
                case 8:
                    gVar.b(8, typedArray.getDimensionPixelSize(index, iVar.f15762K));
                    c6 = 5;
                    break;
                case 11:
                    gVar.b(11, typedArray.getDimensionPixelSize(index, iVar.f15768Q));
                    c6 = 5;
                    break;
                case 12:
                    gVar.b(12, typedArray.getDimensionPixelSize(index, iVar.f15769R));
                    c6 = 5;
                    break;
                case 13:
                    gVar.b(13, typedArray.getDimensionPixelSize(index, iVar.f15765N));
                    c6 = 5;
                    break;
                case 14:
                    gVar.b(14, typedArray.getDimensionPixelSize(index, iVar.f15767P));
                    c6 = 5;
                    break;
                case 15:
                    gVar.b(15, typedArray.getDimensionPixelSize(index, iVar.f15770S));
                    c6 = 5;
                    break;
                case 16:
                    gVar.b(16, typedArray.getDimensionPixelSize(index, iVar.f15766O));
                    c6 = 5;
                    break;
                case 17:
                    gVar.b(17, typedArray.getDimensionPixelOffset(index, iVar.f15784e));
                    c6 = 5;
                    break;
                case 18:
                    gVar.b(18, typedArray.getDimensionPixelOffset(index, iVar.f15786f));
                    c6 = 5;
                    break;
                case 19:
                    gVar.a(19, typedArray.getFloat(index, iVar.f15788g));
                    c6 = 5;
                    break;
                case 20:
                    gVar.a(20, typedArray.getFloat(index, iVar.f15813x));
                    c6 = 5;
                    break;
                case 21:
                    gVar.b(21, typedArray.getLayoutDimension(index, iVar.f15782d));
                    c6 = 5;
                    break;
                case 22:
                    gVar.b(22, f15850g[typedArray.getInt(index, kVar.f15831b)]);
                    c6 = 5;
                    break;
                case 23:
                    gVar.b(23, typedArray.getLayoutDimension(index, iVar.f15781c));
                    c6 = 5;
                    break;
                case 24:
                    gVar.b(24, typedArray.getDimensionPixelSize(index, iVar.f15758G));
                    c6 = 5;
                    break;
                case 27:
                    gVar.b(27, typedArray.getInt(index, iVar.f15757F));
                    c6 = 5;
                    break;
                case 28:
                    gVar.b(28, typedArray.getDimensionPixelSize(index, iVar.f15759H));
                    c6 = 5;
                    break;
                case 31:
                    gVar.b(31, typedArray.getDimensionPixelSize(index, iVar.f15763L));
                    c6 = 5;
                    break;
                case 34:
                    gVar.b(34, typedArray.getDimensionPixelSize(index, iVar.f15760I));
                    c6 = 5;
                    break;
                case 37:
                    gVar.a(37, typedArray.getFloat(index, iVar.f15814y));
                    c6 = 5;
                    break;
                case BillBusinessType.BUSINESS_TYPE_TRIP /* 38 */:
                    int resourceId = typedArray.getResourceId(index, hVar.f15743a);
                    hVar.f15743a = resourceId;
                    gVar.b(38, resourceId);
                    c6 = 5;
                    break;
                case 39:
                    gVar.a(39, typedArray.getFloat(index, iVar.f15773V));
                    c6 = 5;
                    break;
                case 40:
                    gVar.a(40, typedArray.getFloat(index, iVar.f15772U));
                    c6 = 5;
                    break;
                case 41:
                    gVar.b(41, typedArray.getInt(index, iVar.f15774W));
                    c6 = 5;
                    break;
                case DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER /* 42 */:
                    gVar.b(42, typedArray.getInt(index, iVar.f15775X));
                    c6 = 5;
                    break;
                case 43:
                    gVar.a(43, typedArray.getFloat(index, kVar.f15833d));
                    c6 = 5;
                    break;
                case 44:
                    gVar.d(44, true);
                    gVar.a(44, typedArray.getDimension(index, lVar.f15849n));
                    c6 = 5;
                    break;
                case 45:
                    gVar.a(45, typedArray.getFloat(index, lVar.f15838c));
                    c6 = 5;
                    break;
                case 46:
                    gVar.a(46, typedArray.getFloat(index, lVar.f15839d));
                    c6 = 5;
                    break;
                case ShareDialog.SHARE_BUSINESS_TYPE_JUNE_INVITE_TASK /* 47 */:
                    gVar.a(47, typedArray.getFloat(index, lVar.f15840e));
                    c6 = 5;
                    break;
                case 48:
                    gVar.a(48, typedArray.getFloat(index, lVar.f15841f));
                    c6 = 5;
                    break;
                case NavigationBarView.ITEM_GRAVITY_TOP_CENTER /* 49 */:
                    gVar.a(49, typedArray.getDimension(index, lVar.f15842g));
                    c6 = 5;
                    break;
                case 50:
                    gVar.a(50, typedArray.getDimension(index, lVar.f15843h));
                    c6 = 5;
                    break;
                case 51:
                    gVar.a(51, typedArray.getDimension(index, lVar.f15845j));
                    c6 = 5;
                    break;
                case 52:
                    gVar.a(52, typedArray.getDimension(index, lVar.f15846k));
                    c6 = 5;
                    break;
                case 53:
                    gVar.a(53, typedArray.getDimension(index, lVar.f15847l));
                    c6 = 5;
                    break;
                case 54:
                    gVar.b(54, typedArray.getInt(index, iVar.f15776Y));
                    c6 = 5;
                    break;
                case 55:
                    gVar.b(55, typedArray.getInt(index, iVar.f15777Z));
                    c6 = 5;
                    break;
                case 56:
                    gVar.b(56, typedArray.getDimensionPixelSize(index, iVar.f15779a0));
                    c6 = 5;
                    break;
                case 57:
                    gVar.b(57, typedArray.getDimensionPixelSize(index, iVar.b0));
                    c6 = 5;
                    break;
                case 58:
                    gVar.b(58, typedArray.getDimensionPixelSize(index, iVar.c0));
                    c6 = 5;
                    break;
                case 59:
                    gVar.b(59, typedArray.getDimensionPixelSize(index, iVar.f15783d0));
                    c6 = 5;
                    break;
                case PictureConfig.MAX_PAGE_SIZE /* 60 */:
                    gVar.a(60, typedArray.getFloat(index, lVar.f15837b));
                    c6 = 5;
                    break;
                case HomeMenuBean.BOTTOM_TAB_ME /* 62 */:
                    gVar.b(62, typedArray.getDimensionPixelSize(index, iVar.f15753B));
                    c6 = 5;
                    break;
                case HomeMenuBean.BOTTOM_TAB_FINANCE /* 63 */:
                    gVar.a(63, typedArray.getFloat(index, iVar.f15754C));
                    c6 = 5;
                    break;
                case 64:
                    gVar.b(64, o(typedArray, index, jVar.f15818b));
                    c6 = 5;
                    break;
                case HomeMenuBean.BOTTOM_TAB_INVEST /* 65 */:
                    if (typedArray.peekValue(index).type == 3) {
                        gVar.c(65, typedArray.getString(index));
                    } else {
                        gVar.c(65, O.e.f6488d[typedArray.getInteger(index, i7)]);
                    }
                    c6 = 5;
                    break;
                case HomeMenuBean.BOTTOM_TAB_GIVEAWAY /* 66 */:
                    i7 = 0;
                    gVar.b(66, typedArray.getInt(index, 0));
                    c6 = 5;
                    break;
                case 67:
                    gVar.a(67, typedArray.getFloat(index, jVar.f15824h));
                    i7 = 0;
                    c6 = 5;
                    break;
                case 68:
                    gVar.a(68, typedArray.getFloat(index, kVar.f15834e));
                    i7 = 0;
                    c6 = 5;
                    break;
                case 69:
                    gVar.a(69, typedArray.getFloat(index, 1.0f));
                    i7 = 0;
                    c6 = 5;
                    break;
                case 70:
                    gVar.a(70, typedArray.getFloat(index, 1.0f));
                    i7 = 0;
                    c6 = 5;
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    i7 = 0;
                    c6 = 5;
                    break;
                case KkCarPayResultDialog.SUCCESS_TITLE_MARGIN_TOP_DP /* 72 */:
                    gVar.b(72, typedArray.getInt(index, iVar.f15789g0));
                    i7 = 0;
                    c6 = 5;
                    break;
                case 73:
                    gVar.b(73, typedArray.getDimensionPixelSize(index, iVar.f15791h0));
                    i7 = 0;
                    c6 = 5;
                    break;
                case 74:
                    gVar.c(74, typedArray.getString(index));
                    i7 = 0;
                    c6 = 5;
                    break;
                case 75:
                    gVar.d(75, typedArray.getBoolean(index, iVar.f15804o0));
                    i7 = 0;
                    c6 = 5;
                    break;
                case 76:
                    gVar.b(76, typedArray.getInt(index, jVar.f15821e));
                    i7 = 0;
                    c6 = 5;
                    break;
                case 77:
                    gVar.c(77, typedArray.getString(index));
                    i7 = 0;
                    c6 = 5;
                    break;
                case 78:
                    gVar.b(78, typedArray.getInt(index, kVar.f15832c));
                    i7 = 0;
                    c6 = 5;
                    break;
                case 79:
                    gVar.a(79, typedArray.getFloat(index, jVar.f15823g));
                    i7 = 0;
                    c6 = 5;
                    break;
                case 80:
                    gVar.d(80, typedArray.getBoolean(index, iVar.f15800m0));
                    i7 = 0;
                    c6 = 5;
                    break;
                case 81:
                    gVar.d(81, typedArray.getBoolean(index, iVar.f15802n0));
                    i7 = 0;
                    c6 = 5;
                    break;
                case 82:
                    gVar.b(82, typedArray.getInteger(index, jVar.f15819c));
                    i7 = 0;
                    c6 = 5;
                    break;
                case 83:
                    gVar.b(83, o(typedArray, index, lVar.f15844i));
                    i7 = 0;
                    c6 = 5;
                    break;
                case 84:
                    gVar.b(84, typedArray.getInteger(index, jVar.f15826j));
                    i7 = 0;
                    c6 = 5;
                    break;
                case 85:
                    gVar.a(85, typedArray.getFloat(index, jVar.f15825i));
                    i7 = 0;
                    c6 = 5;
                    break;
                case 86:
                    int i12 = typedArray.peekValue(index).type;
                    if (i12 == 1) {
                        int resourceId2 = typedArray.getResourceId(index, -1);
                        jVar.f15829m = resourceId2;
                        gVar.b(89, resourceId2);
                        if (jVar.f15829m != -1) {
                            jVar.f15828l = -2;
                            gVar.b(88, -2);
                        }
                    } else if (i12 == 3) {
                        String string = typedArray.getString(index);
                        jVar.f15827k = string;
                        gVar.c(90, string);
                        if (jVar.f15827k.indexOf("/") > 0) {
                            int resourceId3 = typedArray.getResourceId(index, -1);
                            jVar.f15829m = resourceId3;
                            gVar.b(89, resourceId3);
                            jVar.f15828l = -2;
                            gVar.b(88, -2);
                        } else {
                            jVar.f15828l = -1;
                            gVar.b(88, -1);
                        }
                    } else {
                        int integer = typedArray.getInteger(index, jVar.f15829m);
                        jVar.f15828l = integer;
                        gVar.b(88, integer);
                    }
                    i7 = 0;
                    c6 = 5;
                    break;
                case 87:
                    Integer.toHexString(index);
                    sparseIntArray.get(index);
                    c6 = 5;
                    break;
                case HomeDialogState.PRIORITY_OK_CARD_DIALOG /* 93 */:
                    gVar.b(93, typedArray.getDimensionPixelSize(index, iVar.f15764M));
                    c6 = 5;
                    break;
                case 94:
                    gVar.b(94, typedArray.getDimensionPixelSize(index, iVar.f15771T));
                    c6 = 5;
                    break;
                case HomeDialogState.PRIORITY_AD_DIALOG /* 95 */:
                    p(gVar, typedArray, index, i7);
                    c6 = 5;
                    break;
                case 96:
                    p(gVar, typedArray, index, 1);
                    c6 = 5;
                    break;
                case 97:
                    gVar.b(97, typedArray.getInt(index, iVar.f15806p0));
                    c6 = 5;
                    break;
                case HomeDialogState.PRIORITY_DARK_MODE_NOTIFICATION /* 98 */:
                    if (MotionLayout.f1) {
                        int resourceId4 = typedArray.getResourceId(index, hVar.f15743a);
                        hVar.f15743a = resourceId4;
                        if (resourceId4 == -1) {
                            hVar.f15744b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        hVar.f15744b = typedArray.getString(index);
                    } else {
                        hVar.f15743a = typedArray.getResourceId(index, hVar.f15743a);
                    }
                    c6 = 5;
                    break;
                case 99:
                    gVar.d(99, typedArray.getBoolean(index, iVar.f15790h));
                    c6 = 5;
                    break;
            }
        }
    }

    public static String t(int i7) {
        switch (i7) {
            case 1:
                return ViewProps.LEFT;
            case 2:
                return ViewProps.RIGHT;
            case 3:
                return ViewProps.TOP;
            case 4:
                return ViewProps.BOTTOM;
            case 5:
                return "baseline";
            case 6:
                return ViewProps.START;
            case 7:
                return ViewProps.END;
            default:
                return "undefined";
        }
    }

    public final void a(MotionLayout motionLayout) {
        h hVar;
        int childCount = motionLayout.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = motionLayout.getChildAt(i7);
            int id2 = childAt.getId();
            HashMap map = this.f15858f;
            if (!map.containsKey(Integer.valueOf(id2))) {
                J3.a.s(childAt);
            } else {
                if (this.f15857e && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (map.containsKey(Integer.valueOf(id2)) && (hVar = (h) map.get(Integer.valueOf(id2))) != null) {
                    a.e(childAt, hVar.f15749g);
                }
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        c(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap map = this.f15858f;
        HashSet<Integer> hashSet = new HashSet(map.keySet());
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = constraintLayout.getChildAt(i7);
            int id2 = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id2))) {
                J3.a.s(childAt);
            } else {
                if (this.f15857e && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1 && map.containsKey(Integer.valueOf(id2))) {
                    hashSet.remove(Integer.valueOf(id2));
                    h hVar = (h) map.get(Integer.valueOf(id2));
                    if (hVar != null) {
                        if (childAt instanceof Barrier) {
                            i iVar = hVar.f15747e;
                            iVar.i0 = 1;
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id2);
                            barrier.setType(iVar.f15789g0);
                            barrier.setMargin(iVar.f15791h0);
                            barrier.setAllowsGoneWidget(iVar.f15804o0);
                            int[] iArr = iVar.f15794j0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = iVar.f15796k0;
                                if (str != null) {
                                    int[] iArrI = i(barrier, str);
                                    iVar.f15794j0 = iArrI;
                                    barrier.setReferencedIds(iArrI);
                                }
                            }
                        }
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                        layoutParams.a();
                        hVar.a(layoutParams);
                        a.e(childAt, hVar.f15749g);
                        childAt.setLayoutParams(layoutParams);
                        k kVar = hVar.f15745c;
                        if (kVar.f15832c == 0) {
                            childAt.setVisibility(kVar.f15831b);
                        }
                        childAt.setAlpha(kVar.f15833d);
                        l lVar = hVar.f15748f;
                        childAt.setRotation(lVar.f15837b);
                        childAt.setRotationX(lVar.f15838c);
                        childAt.setRotationY(lVar.f15839d);
                        childAt.setScaleX(lVar.f15840e);
                        childAt.setScaleY(lVar.f15841f);
                        if (lVar.f15844i != -1) {
                            View viewFindViewById = ((View) childAt.getParent()).findViewById(lVar.f15844i);
                            if (viewFindViewById != null) {
                                float bottom = (viewFindViewById.getBottom() + viewFindViewById.getTop()) / 2.0f;
                                float right = (viewFindViewById.getRight() + viewFindViewById.getLeft()) / 2.0f;
                                if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                    float left = right - childAt.getLeft();
                                    float top2 = bottom - childAt.getTop();
                                    childAt.setPivotX(left);
                                    childAt.setPivotY(top2);
                                }
                            }
                        } else {
                            if (!Float.isNaN(lVar.f15842g)) {
                                childAt.setPivotX(lVar.f15842g);
                            }
                            if (!Float.isNaN(lVar.f15843h)) {
                                childAt.setPivotY(lVar.f15843h);
                            }
                        }
                        childAt.setTranslationX(lVar.f15845j);
                        childAt.setTranslationY(lVar.f15846k);
                        childAt.setTranslationZ(lVar.f15847l);
                        if (lVar.f15848m) {
                            childAt.setElevation(lVar.f15849n);
                        }
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            h hVar2 = (h) map.get(num);
            if (hVar2 != null) {
                i iVar2 = hVar2.f15747e;
                if (iVar2.i0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    int[] iArr2 = iVar2.f15794j0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = iVar2.f15796k0;
                        if (str2 != null) {
                            int[] iArrI2 = i(barrier2, str2);
                            iVar2.f15794j0 = iArrI2;
                            barrier2.setReferencedIds(iArrI2);
                        }
                    }
                    barrier2.setType(iVar2.f15789g0);
                    barrier2.setMargin(iVar2.f15791h0);
                    ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.p();
                    hVar2.a(layoutParamsGenerateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, layoutParamsGenerateDefaultLayoutParams);
                }
                if (iVar2.f15778a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    hVar2.a(layoutParamsGenerateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, layoutParamsGenerateDefaultLayoutParams2);
                }
            }
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt2 = constraintLayout.getChildAt(i10);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).f(constraintLayout);
            }
        }
    }

    public final void e(ConstraintLayout constraintLayout) {
        int i7;
        int i10;
        m mVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map = mVar.f15858f;
        map.clear();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = constraintLayout.getChildAt(i11);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (mVar.f15857e && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id2))) {
                map.put(Integer.valueOf(id2), new h());
            }
            h hVar = (h) map.get(Integer.valueOf(id2));
            if (hVar == null) {
                i7 = childCount;
            } else {
                HashMap map2 = mVar.f15856d;
                HashMap map3 = new HashMap();
                Class<?> cls = childAt.getClass();
                for (String str : map2.keySet()) {
                    a aVar = (a) map2.get(str);
                    try {
                        if (str.equals("BackgroundColor")) {
                            map3.put(str, new a(aVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                            i10 = childCount;
                        } else {
                            i10 = childCount;
                            try {
                                map3.put(str, new a(aVar, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0])));
                            } catch (IllegalAccessException e10) {
                                e = e10;
                                e.printStackTrace();
                            } catch (NoSuchMethodException e11) {
                                e = e11;
                                e.printStackTrace();
                            } catch (InvocationTargetException e12) {
                                e = e12;
                                e.printStackTrace();
                            }
                        }
                    } catch (IllegalAccessException e13) {
                        e = e13;
                        i10 = childCount;
                    } catch (NoSuchMethodException e14) {
                        e = e14;
                        i10 = childCount;
                    } catch (InvocationTargetException e15) {
                        e = e15;
                        i10 = childCount;
                    }
                    childCount = i10;
                }
                i7 = childCount;
                hVar.f15749g = map3;
                hVar.c(id2, layoutParams);
                int visibility = childAt.getVisibility();
                k kVar = hVar.f15745c;
                kVar.f15831b = visibility;
                kVar.f15833d = childAt.getAlpha();
                float rotation = childAt.getRotation();
                l lVar = hVar.f15748f;
                lVar.f15837b = rotation;
                lVar.f15838c = childAt.getRotationX();
                lVar.f15839d = childAt.getRotationY();
                lVar.f15840e = childAt.getScaleX();
                lVar.f15841f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    lVar.f15842g = pivotX;
                    lVar.f15843h = pivotY;
                }
                lVar.f15845j = childAt.getTranslationX();
                lVar.f15846k = childAt.getTranslationY();
                lVar.f15847l = childAt.getTranslationZ();
                if (lVar.f15848m) {
                    lVar.f15849n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    boolean allowsGoneWidget = barrier.getAllowsGoneWidget();
                    i iVar = hVar.f15747e;
                    iVar.f15804o0 = allowsGoneWidget;
                    iVar.f15794j0 = barrier.getReferencedIds();
                    iVar.f15789g0 = barrier.getType();
                    iVar.f15791h0 = barrier.getMargin();
                }
            }
            i11++;
            mVar = this;
            childCount = i7;
        }
    }

    public final void f(m mVar) {
        HashMap map = this.f15858f;
        map.clear();
        for (Integer num : mVar.f15858f.keySet()) {
            h hVar = (h) mVar.f15858f.get(num);
            if (hVar != null) {
                map.put(num, hVar.clone());
            }
        }
    }

    public final void g(int i7, int i10, int i11, int i12) {
        HashMap map = this.f15858f;
        if (!map.containsKey(Integer.valueOf(i7))) {
            map.put(Integer.valueOf(i7), new h());
        }
        h hVar = (h) map.get(Integer.valueOf(i7));
        if (hVar == null) {
            return;
        }
        i iVar = hVar.f15747e;
        switch (i10) {
            case 1:
                if (i12 == 1) {
                    iVar.f15792i = i11;
                    iVar.f15793j = -1;
                    return;
                } else if (i12 == 2) {
                    iVar.f15793j = i11;
                    iVar.f15792i = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + t(i12) + " undefined");
                }
            case 2:
                if (i12 == 1) {
                    iVar.f15795k = i11;
                    iVar.f15797l = -1;
                    return;
                } else if (i12 == 2) {
                    iVar.f15797l = i11;
                    iVar.f15795k = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + t(i12) + " undefined");
                }
            case 3:
                if (i12 == 3) {
                    iVar.f15799m = i11;
                    iVar.f15801n = -1;
                    iVar.f15807q = -1;
                    iVar.f15808r = -1;
                    iVar.f15809s = -1;
                    return;
                }
                if (i12 != 4) {
                    throw new IllegalArgumentException("right to " + t(i12) + " undefined");
                }
                iVar.f15801n = i11;
                iVar.f15799m = -1;
                iVar.f15807q = -1;
                iVar.f15808r = -1;
                iVar.f15809s = -1;
                return;
            case 4:
                if (i12 == 4) {
                    iVar.f15805p = i11;
                    iVar.f15803o = -1;
                    iVar.f15807q = -1;
                    iVar.f15808r = -1;
                    iVar.f15809s = -1;
                    return;
                }
                if (i12 != 3) {
                    throw new IllegalArgumentException("right to " + t(i12) + " undefined");
                }
                iVar.f15803o = i11;
                iVar.f15805p = -1;
                iVar.f15807q = -1;
                iVar.f15808r = -1;
                iVar.f15809s = -1;
                return;
            case 5:
                if (i12 == 5) {
                    iVar.f15807q = i11;
                    iVar.f15805p = -1;
                    iVar.f15803o = -1;
                    iVar.f15799m = -1;
                    iVar.f15801n = -1;
                    return;
                }
                if (i12 == 3) {
                    iVar.f15808r = i11;
                    iVar.f15805p = -1;
                    iVar.f15803o = -1;
                    iVar.f15799m = -1;
                    iVar.f15801n = -1;
                    return;
                }
                if (i12 != 4) {
                    throw new IllegalArgumentException("right to " + t(i12) + " undefined");
                }
                iVar.f15809s = i11;
                iVar.f15805p = -1;
                iVar.f15803o = -1;
                iVar.f15799m = -1;
                iVar.f15801n = -1;
                return;
            case 6:
                if (i12 == 6) {
                    iVar.f15810u = i11;
                    iVar.t = -1;
                    return;
                } else if (i12 == 7) {
                    iVar.t = i11;
                    iVar.f15810u = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + t(i12) + " undefined");
                }
            case 7:
                if (i12 == 7) {
                    iVar.f15812w = i11;
                    iVar.f15811v = -1;
                    return;
                } else if (i12 == 6) {
                    iVar.f15811v = i11;
                    iVar.f15812w = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + t(i12) + " undefined");
                }
            default:
                throw new IllegalArgumentException(t(i10) + " to " + t(i12) + " unknown");
        }
    }

    public final void h(int i7, int i10, int i11, int i12, int i13) {
        HashMap map = this.f15858f;
        if (!map.containsKey(Integer.valueOf(i7))) {
            map.put(Integer.valueOf(i7), new h());
        }
        h hVar = (h) map.get(Integer.valueOf(i7));
        if (hVar == null) {
            return;
        }
        i iVar = hVar.f15747e;
        switch (i10) {
            case 1:
                if (i12 == 1) {
                    iVar.f15792i = i11;
                    iVar.f15793j = -1;
                } else {
                    if (i12 != 2) {
                        throw new IllegalArgumentException("Left to " + t(i12) + " undefined");
                    }
                    iVar.f15793j = i11;
                    iVar.f15792i = -1;
                }
                iVar.f15758G = i13;
                return;
            case 2:
                if (i12 == 1) {
                    iVar.f15795k = i11;
                    iVar.f15797l = -1;
                } else {
                    if (i12 != 2) {
                        throw new IllegalArgumentException("right to " + t(i12) + " undefined");
                    }
                    iVar.f15797l = i11;
                    iVar.f15795k = -1;
                }
                iVar.f15759H = i13;
                return;
            case 3:
                if (i12 == 3) {
                    iVar.f15799m = i11;
                    iVar.f15801n = -1;
                    iVar.f15807q = -1;
                    iVar.f15808r = -1;
                    iVar.f15809s = -1;
                } else {
                    if (i12 != 4) {
                        throw new IllegalArgumentException("right to " + t(i12) + " undefined");
                    }
                    iVar.f15801n = i11;
                    iVar.f15799m = -1;
                    iVar.f15807q = -1;
                    iVar.f15808r = -1;
                    iVar.f15809s = -1;
                }
                iVar.f15760I = i13;
                return;
            case 4:
                if (i12 == 4) {
                    iVar.f15805p = i11;
                    iVar.f15803o = -1;
                    iVar.f15807q = -1;
                    iVar.f15808r = -1;
                    iVar.f15809s = -1;
                } else {
                    if (i12 != 3) {
                        throw new IllegalArgumentException("right to " + t(i12) + " undefined");
                    }
                    iVar.f15803o = i11;
                    iVar.f15805p = -1;
                    iVar.f15807q = -1;
                    iVar.f15808r = -1;
                    iVar.f15809s = -1;
                }
                iVar.f15761J = i13;
                return;
            case 5:
                if (i12 == 5) {
                    iVar.f15807q = i11;
                    iVar.f15805p = -1;
                    iVar.f15803o = -1;
                    iVar.f15799m = -1;
                    iVar.f15801n = -1;
                    return;
                }
                if (i12 == 3) {
                    iVar.f15808r = i11;
                    iVar.f15805p = -1;
                    iVar.f15803o = -1;
                    iVar.f15799m = -1;
                    iVar.f15801n = -1;
                    return;
                }
                if (i12 != 4) {
                    throw new IllegalArgumentException("right to " + t(i12) + " undefined");
                }
                iVar.f15809s = i11;
                iVar.f15805p = -1;
                iVar.f15803o = -1;
                iVar.f15799m = -1;
                iVar.f15801n = -1;
                return;
            case 6:
                if (i12 == 6) {
                    iVar.f15810u = i11;
                    iVar.t = -1;
                } else {
                    if (i12 != 7) {
                        throw new IllegalArgumentException("right to " + t(i12) + " undefined");
                    }
                    iVar.t = i11;
                    iVar.f15810u = -1;
                }
                iVar.f15763L = i13;
                return;
            case 7:
                if (i12 == 7) {
                    iVar.f15812w = i11;
                    iVar.f15811v = -1;
                } else {
                    if (i12 != 6) {
                        throw new IllegalArgumentException("right to " + t(i12) + " undefined");
                    }
                    iVar.f15811v = i11;
                    iVar.f15812w = -1;
                }
                iVar.f15762K = i13;
                return;
            default:
                throw new IllegalArgumentException(t(i10) + " to " + t(i12) + " unknown");
        }
    }

    public final h k(int i7) {
        HashMap map = this.f15858f;
        if (!map.containsKey(Integer.valueOf(i7))) {
            map.put(Integer.valueOf(i7), new h());
        }
        return (h) map.get(Integer.valueOf(i7));
    }

    public final h l(int i7) {
        HashMap map = this.f15858f;
        if (map.containsKey(Integer.valueOf(i7))) {
            return (h) map.get(Integer.valueOf(i7));
        }
        return null;
    }

    public final void m(int i7, Context context) {
        XmlResourceParser xml = context.getResources().getXml(i7);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    h hVarJ = j(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        hVarJ.f15747e.f15778a = true;
                    }
                    this.f15858f.put(Integer.valueOf(hVarJ.f15743a), hVarJ);
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void n(Context context, XmlResourceParser xmlResourceParser) {
        try {
            int eventType = xmlResourceParser.getEventType();
            h hVarJ = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlResourceParser.getName();
                } else if (eventType == 2) {
                    switch (xmlResourceParser.getName()) {
                        case "Constraint":
                            hVarJ = j(context, Xml.asAttributeSet(xmlResourceParser), false);
                            break;
                        case "ConstraintOverride":
                            hVarJ = j(context, Xml.asAttributeSet(xmlResourceParser), true);
                            break;
                        case "Guideline":
                            hVarJ = j(context, Xml.asAttributeSet(xmlResourceParser), false);
                            i iVar = hVarJ.f15747e;
                            iVar.f15778a = true;
                            iVar.f15780b = true;
                            break;
                        case "Barrier":
                            hVarJ = j(context, Xml.asAttributeSet(xmlResourceParser), false);
                            hVarJ.f15747e.i0 = 1;
                            break;
                        case "PropertySet":
                            if (hVarJ == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            hVarJ.f15745c.a(context, Xml.asAttributeSet(xmlResourceParser));
                            break;
                            break;
                        case "Transform":
                            if (hVarJ == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            hVarJ.f15748f.b(context, Xml.asAttributeSet(xmlResourceParser));
                            break;
                            break;
                        case "Layout":
                            if (hVarJ == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            hVarJ.f15747e.b(context, Xml.asAttributeSet(xmlResourceParser));
                            break;
                            break;
                        case "Motion":
                            if (hVarJ == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            hVarJ.f15746d.b(context, Xml.asAttributeSet(xmlResourceParser));
                            break;
                            break;
                        case "CustomAttribute":
                        case "CustomMethod":
                            if (hVarJ == null) {
                                throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                            }
                            a.d(context, xmlResourceParser, hVarJ.f15749g);
                            break;
                            break;
                    }
                } else if (eventType == 3) {
                    String lowerCase = xmlResourceParser.getName().toLowerCase(Locale.ROOT);
                    switch (lowerCase.hashCode()) {
                        case -2075718416:
                            if (lowerCase.equals("guideline")) {
                            }
                            break;
                        case -190376483:
                            if (lowerCase.equals("constraint")) {
                            }
                            break;
                        case 426575017:
                            if (lowerCase.equals("constraintoverride")) {
                            }
                            break;
                        case 2146106725:
                            if (lowerCase.equals("constraintset")) {
                            }
                            break;
                    }
                    if (r4 == 0) {
                        return;
                    }
                    if (r4 == 1 || r4 == 2 || r4 == 3) {
                        this.f15858f.put(Integer.valueOf(hVarJ.f15743a), hVarJ);
                        hVarJ = null;
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    public final void s(int i7, int i10, int i11) {
        h hVarK = k(i7);
        switch (i10) {
            case 1:
                hVarK.f15747e.f15758G = i11;
                return;
            case 2:
                hVarK.f15747e.f15759H = i11;
                return;
            case 3:
                hVarK.f15747e.f15760I = i11;
                return;
            case 4:
                hVarK.f15747e.f15761J = i11;
                return;
            case 5:
                hVarK.f15747e.f15764M = i11;
                return;
            case 6:
                hVarK.f15747e.f15763L = i11;
                return;
            case 7:
                hVarK.f15747e.f15762K = i11;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }
}
