package Rd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.mikepenz.iconics.view.IconicsImageView;
import com.transsnet.palmpay.airtime.ui.view.GroupPurchaseAvatarLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class l0 implements ViewBinding {

    @NonNull
    public final GroupPurchaseAvatarLayout avaterLl;

    @NonNull
    public final GroupPurchaseAvatarLayout avaterSecondLl;

    @NonNull
    public final ConstraintLayout firstCl;

    @NonNull
    public final TextView itemName;

    @NonNull
    public final TextView itemPriceName;

    @NonNull
    public final TextView itemPriceValue;

    @NonNull
    public final TextView itemSecondName;

    @NonNull
    public final TextView itemSecondPriceName;

    @NonNull
    public final TextView itemSecondPriceValue;

    @NonNull
    public final IconicsImageView ivArrowRight;

    @NonNull
    public final TextView moreTv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ConstraintLayout secCl;

    @NonNull
    public final ConstraintLayout secPlaceholderCl;

    @NonNull
    public final ImageView secPlaceholderIv;

    @NonNull
    public final FrameLayout secondContainer;

    @NonNull
    public final TextView titleTv;

    private l0(@NonNull ConstraintLayout rootView, @NonNull GroupPurchaseAvatarLayout avaterLl, @NonNull GroupPurchaseAvatarLayout avaterSecondLl, @NonNull ConstraintLayout firstCl, @NonNull TextView itemName, @NonNull TextView itemPriceName, @NonNull TextView itemPriceValue, @NonNull TextView itemSecondName, @NonNull TextView itemSecondPriceName, @NonNull TextView itemSecondPriceValue, @NonNull IconicsImageView ivArrowRight, @NonNull TextView moreTv, @NonNull ConstraintLayout secCl, @NonNull ConstraintLayout secPlaceholderCl, @NonNull ImageView secPlaceholderIv, @NonNull FrameLayout secondContainer, @NonNull TextView titleTv) {
        this.rootView = rootView;
        this.avaterLl = avaterLl;
        this.avaterSecondLl = avaterSecondLl;
        this.firstCl = firstCl;
        this.itemName = itemName;
        this.itemPriceName = itemPriceName;
        this.itemPriceValue = itemPriceValue;
        this.itemSecondName = itemSecondName;
        this.itemSecondPriceName = itemSecondPriceName;
        this.itemSecondPriceValue = itemSecondPriceValue;
        this.ivArrowRight = ivArrowRight;
        this.moreTv = moreTv;
        this.secCl = secCl;
        this.secPlaceholderCl = secPlaceholderCl;
        this.secPlaceholderIv = secPlaceholderIv;
        this.secondContainer = secondContainer;
        this.titleTv = titleTv;
    }

    @NonNull
    public static l0 bind(@NonNull View rootView) {
        int i7 = Pd.c.avaterLl;
        GroupPurchaseAvatarLayout groupPurchaseAvatarLayout = (GroupPurchaseAvatarLayout) p059e1.a.m(i7, rootView);
        if (groupPurchaseAvatarLayout != null) {
            i7 = Pd.c.avaterSecondLl;
            GroupPurchaseAvatarLayout groupPurchaseAvatarLayout2 = (GroupPurchaseAvatarLayout) p059e1.a.m(i7, rootView);
            if (groupPurchaseAvatarLayout2 != null) {
                i7 = Pd.c.firstCl;
                ConstraintLayout constraintLayout = (ConstraintLayout) p059e1.a.m(i7, rootView);
                if (constraintLayout != null) {
                    i7 = Pd.c.itemName;
                    TextView textView = (TextView) p059e1.a.m(i7, rootView);
                    if (textView != null) {
                        i7 = Pd.c.itemPriceName;
                        TextView textView2 = (TextView) p059e1.a.m(i7, rootView);
                        if (textView2 != null) {
                            i7 = Pd.c.itemPriceValue;
                            TextView textView3 = (TextView) p059e1.a.m(i7, rootView);
                            if (textView3 != null) {
                                i7 = Pd.c.itemSecondName;
                                TextView textView4 = (TextView) p059e1.a.m(i7, rootView);
                                if (textView4 != null) {
                                    i7 = Pd.c.itemSecondPriceName;
                                    TextView textView5 = (TextView) p059e1.a.m(i7, rootView);
                                    if (textView5 != null) {
                                        i7 = Pd.c.itemSecondPriceValue;
                                        TextView textView6 = (TextView) p059e1.a.m(i7, rootView);
                                        if (textView6 != null) {
                                            i7 = Pd.c.ivArrowRight;
                                            IconicsImageView iconicsImageView = (IconicsImageView) p059e1.a.m(i7, rootView);
                                            if (iconicsImageView != null) {
                                                i7 = Pd.c.moreTv;
                                                TextView textView7 = (TextView) p059e1.a.m(i7, rootView);
                                                if (textView7 != null) {
                                                    i7 = Pd.c.secCl;
                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) p059e1.a.m(i7, rootView);
                                                    if (constraintLayout2 != null) {
                                                        i7 = Pd.c.secPlaceholderCl;
                                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) p059e1.a.m(i7, rootView);
                                                        if (constraintLayout3 != null) {
                                                            i7 = Pd.c.secPlaceholderIv;
                                                            ImageView imageView = (ImageView) p059e1.a.m(i7, rootView);
                                                            if (imageView != null) {
                                                                i7 = Pd.c.secondContainer;
                                                                FrameLayout frameLayout = (FrameLayout) p059e1.a.m(i7, rootView);
                                                                if (frameLayout != null) {
                                                                    i7 = Pd.c.titleTv;
                                                                    TextView textView8 = (TextView) p059e1.a.m(i7, rootView);
                                                                    if (textView8 != null) {
                                                                        return new l0((ConstraintLayout) rootView, groupPurchaseAvatarLayout, groupPurchaseAvatarLayout2, constraintLayout, textView, textView2, textView3, textView4, textView5, textView6, iconicsImageView, textView7, constraintLayout2, constraintLayout3, imageView, frameLayout, textView8);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i7)));
    }

    @NonNull
    public static l0 inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static l0 inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(Pd.d.qt_layout_purchase_sale_view, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
