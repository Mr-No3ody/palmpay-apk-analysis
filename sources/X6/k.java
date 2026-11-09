package X6;

import C9.V;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.palmpay.lib.ui.picker.picker.PickerView;
import com.palmpay.lib.ui.picker.wheel.interfaces.IPickerViewData;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.z;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public N6.d f11021d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public List f11022e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Function3 f11023f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Integer f11024g;

    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:63:0x0103  */
    /* JADX WARN: Code duplicated, block: B:67:0x0114  */
    /* JADX WARN: Code duplicated, block: B:68:0x0119  */
    /* JADX WARN: Code duplicated, block: B:71:0x011e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0124  */
    /* JADX WARN: Code duplicated, block: B:75:0x012c  */
    /* JADX WARN: Code duplicated, block: B:80:0x013f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0144  */
    /* JADX WARN: Code duplicated, block: B:85:0x014a  */
    /* JADX WARN: Type inference failed for: r3v2, types: [X6.h] */
    @Override // V6.a
    public final void c(ViewBinding viewBinding) {
        List list;
        List list2;
        IPickerViewData iPickerViewData;
        List childList;
        List list3;
        IPickerViewData iPickerViewData2;
        List childList2;
        List list4;
        N6.d dVar;
        List childList3;
        IPickerViewData iPickerViewData3;
        List childList4;
        IPickerViewData iPickerViewData4;
        List childList5;
        IPickerViewData iPickerViewData5;
        N6.b binding = (N6.b) viewBinding;
        Intrinsics.checkNotNullParameter(binding, "binding");
        super.e(binding);
        View viewInflate = LayoutInflater.from(getContext()).inflate(L6.g.lib_ui_layout_picker_cascade, (ViewGroup) null, false);
        if (viewInflate == null) {
            throw new NullPointerException("rootView");
        }
        PickerView pickerView = (PickerView) viewInflate;
        this.f11021d = new N6.d(pickerView, pickerView, 1);
        binding.f6086b.addView(pickerView);
        g gVar = new g(this, 0);
        List list5 = this.f11022e;
        if (list5 == null || list5.isEmpty()) {
            list = this.f11022e;
            if (list != null || list.isEmpty()) {
                list2 = this.f11022e;
                if (list2 != null && !list2.isEmpty()) {
                    iPickerViewData = (IPickerViewData) CollectionsKt.firstOrNull(list2);
                    if (iPickerViewData != null) {
                        childList = iPickerViewData.getChildList();
                    } else {
                        childList = null;
                    }
                    list3 = childList;
                    if (list3 != null || list3.isEmpty()) {
                        iPickerViewData2 = (IPickerViewData) CollectionsKt.firstOrNull(list2);
                        if (iPickerViewData2 != null || (childList3 = iPickerViewData2.getChildList()) == null || (iPickerViewData3 = (IPickerViewData) CollectionsKt.firstOrNull(childList3)) == null) {
                            childList2 = null;
                        } else {
                            childList2 = iPickerViewData3.getChildList();
                        }
                        list4 = childList2;
                        if ((list4 != null || list4.isEmpty()) && (dVar = this.f11021d) != null) {
                            PickerView.f(dVar.f6095c, new g(this, 3), null, 6);
                        }
                    }
                }
            } else {
                IPickerViewData iPickerViewData6 = (IPickerViewData) CollectionsKt.firstOrNull(list);
                List childList6 = iPickerViewData6 != null ? iPickerViewData6.getChildList() : null;
                if (childList6 == null || childList6.isEmpty()) {
                    list2 = this.f11022e;
                    if (list2 != null) {
                        iPickerViewData = (IPickerViewData) CollectionsKt.firstOrNull(list2);
                        if (iPickerViewData != null) {
                            childList = iPickerViewData.getChildList();
                        } else {
                            childList = null;
                        }
                        list3 = childList;
                        if (list3 != null) {
                            iPickerViewData2 = (IPickerViewData) CollectionsKt.firstOrNull(list2);
                            if (iPickerViewData2 != null) {
                                childList2 = null;
                            } else {
                                childList2 = null;
                            }
                            list4 = childList2;
                            if (list4 != null) {
                                PickerView.f(dVar.f6095c, new g(this, 3), null, 6);
                            } else {
                                PickerView.f(dVar.f6095c, new g(this, 3), null, 6);
                            }
                        } else {
                            iPickerViewData2 = (IPickerViewData) CollectionsKt.firstOrNull(list2);
                            if (iPickerViewData2 != null) {
                                childList2 = null;
                            } else {
                                childList2 = null;
                            }
                            list4 = childList2;
                            if (list4 != null) {
                                PickerView.f(dVar.f6095c, new g(this, 3), null, 6);
                            } else {
                                PickerView.f(dVar.f6095c, new g(this, 3), null, 6);
                            }
                        }
                    }
                } else {
                    IPickerViewData iPickerViewData7 = (IPickerViewData) CollectionsKt.firstOrNull(list);
                    List childList7 = (iPickerViewData7 == null || (childList4 = iPickerViewData7.getChildList()) == null || (iPickerViewData4 = (IPickerViewData) CollectionsKt.firstOrNull(childList4)) == null) ? null : iPickerViewData4.getChildList();
                    if (childList7 == null || childList7.isEmpty()) {
                        N6.d dVar2 = this.f11021d;
                        if (dVar2 != null) {
                            final int i7 = 1;
                            PickerView.f(dVar2.f6095c, new g(this, 2), new Function1(this) { // from class: X6.h

                                /* JADX INFO: renamed from: b, reason: collision with root package name */
                                public final /* synthetic */ k f11014b;

                                {
                                    this.f11014b = this;
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    IPickerViewData iPickerViewData8;
                                    List childList8;
                                    IPickerViewData iPickerViewData9;
                                    List childList9;
                                    int i10 = i7;
                                    int iIntValue = ((Integer) obj).intValue();
                                    switch (i10) {
                                        case 0:
                                            k kVar = this.f11014b;
                                            List list6 = kVar.f11022e;
                                            if ((list6 != null ? list6.size() : 0) <= iIntValue) {
                                                return z.f38935a;
                                            }
                                            List list7 = kVar.f11022e;
                                            return (list7 == null || (iPickerViewData8 = (IPickerViewData) list7.get(iIntValue)) == null || (childList8 = iPickerViewData8.getChildList()) == null) ? z.f38935a : childList8;
                                        default:
                                            k kVar2 = this.f11014b;
                                            List list8 = kVar2.f11022e;
                                            if ((list8 != null ? list8.size() : 0) <= iIntValue) {
                                                return z.f38935a;
                                            }
                                            List list9 = kVar2.f11022e;
                                            return (list9 == null || (iPickerViewData9 = (IPickerViewData) list9.get(iIntValue)) == null || (childList9 = iPickerViewData9.getChildList()) == null) ? z.f38935a : childList9;
                                    }
                                }
                            }, 4);
                        }
                    } else {
                        list2 = this.f11022e;
                        if (list2 != null) {
                            iPickerViewData = (IPickerViewData) CollectionsKt.firstOrNull(list2);
                            if (iPickerViewData != null) {
                                childList = iPickerViewData.getChildList();
                            } else {
                                childList = null;
                            }
                            list3 = childList;
                            if (list3 != null) {
                                iPickerViewData2 = (IPickerViewData) CollectionsKt.firstOrNull(list2);
                                if (iPickerViewData2 != null) {
                                    childList2 = null;
                                } else {
                                    childList2 = null;
                                }
                                list4 = childList2;
                                if (list4 != null) {
                                    PickerView.f(dVar.f6095c, new g(this, 3), null, 6);
                                } else {
                                    PickerView.f(dVar.f6095c, new g(this, 3), null, 6);
                                }
                            } else {
                                iPickerViewData2 = (IPickerViewData) CollectionsKt.firstOrNull(list2);
                                if (iPickerViewData2 != null) {
                                    childList2 = null;
                                } else {
                                    childList2 = null;
                                }
                                list4 = childList2;
                                if (list4 != null) {
                                    PickerView.f(dVar.f6095c, new g(this, 3), null, 6);
                                } else {
                                    PickerView.f(dVar.f6095c, new g(this, 3), null, 6);
                                }
                            }
                        }
                    }
                }
            }
        } else {
            IPickerViewData iPickerViewData8 = (IPickerViewData) CollectionsKt.firstOrNull(list5);
            List childList8 = iPickerViewData8 != null ? iPickerViewData8.getChildList() : null;
            if (childList8 == null || childList8.isEmpty()) {
                list = this.f11022e;
                if (list != null) {
                    list2 = this.f11022e;
                    if (list2 != null) {
                        iPickerViewData = (IPickerViewData) CollectionsKt.firstOrNull(list2);
                        if (iPickerViewData != null) {
                            childList = iPickerViewData.getChildList();
                        } else {
                            childList = null;
                        }
                        list3 = childList;
                        if (list3 != null) {
                            iPickerViewData2 = (IPickerViewData) CollectionsKt.firstOrNull(list2);
                            if (iPickerViewData2 != null) {
                                childList2 = null;
                            } else {
                                childList2 = null;
                            }
                            list4 = childList2;
                            if (list4 != null) {
                                PickerView.f(dVar.f6095c, new g(this, 3), null, 6);
                            } else {
                                PickerView.f(dVar.f6095c, new g(this, 3), null, 6);
                            }
                        } else {
                            iPickerViewData2 = (IPickerViewData) CollectionsKt.firstOrNull(list2);
                            if (iPickerViewData2 != null) {
                                childList2 = null;
                            } else {
                                childList2 = null;
                            }
                            list4 = childList2;
                            if (list4 != null) {
                                PickerView.f(dVar.f6095c, new g(this, 3), null, 6);
                            } else {
                                PickerView.f(dVar.f6095c, new g(this, 3), null, 6);
                            }
                        }
                    }
                } else {
                    list2 = this.f11022e;
                    if (list2 != null) {
                        iPickerViewData = (IPickerViewData) CollectionsKt.firstOrNull(list2);
                        if (iPickerViewData != null) {
                            childList = iPickerViewData.getChildList();
                        } else {
                            childList = null;
                        }
                        list3 = childList;
                        if (list3 != null) {
                            iPickerViewData2 = (IPickerViewData) CollectionsKt.firstOrNull(list2);
                            if (iPickerViewData2 != null) {
                                childList2 = null;
                            } else {
                                childList2 = null;
                            }
                            list4 = childList2;
                            if (list4 != null) {
                                PickerView.f(dVar.f6095c, new g(this, 3), null, 6);
                            } else {
                                PickerView.f(dVar.f6095c, new g(this, 3), null, 6);
                            }
                        } else {
                            iPickerViewData2 = (IPickerViewData) CollectionsKt.firstOrNull(list2);
                            if (iPickerViewData2 != null) {
                                childList2 = null;
                            } else {
                                childList2 = null;
                            }
                            list4 = childList2;
                            if (list4 != null) {
                                PickerView.f(dVar.f6095c, new g(this, 3), null, 6);
                            } else {
                                PickerView.f(dVar.f6095c, new g(this, 3), null, 6);
                            }
                        }
                    }
                }
            } else {
                IPickerViewData iPickerViewData9 = (IPickerViewData) CollectionsKt.firstOrNull(list5);
                List childList9 = (iPickerViewData9 == null || (childList5 = iPickerViewData9.getChildList()) == null || (iPickerViewData5 = (IPickerViewData) CollectionsKt.firstOrNull(childList5)) == null) ? null : iPickerViewData5.getChildList();
                if (childList9 == null || childList9.isEmpty()) {
                    list = this.f11022e;
                    if (list != null) {
                        list2 = this.f11022e;
                        if (list2 != null) {
                            iPickerViewData = (IPickerViewData) CollectionsKt.firstOrNull(list2);
                            if (iPickerViewData != null) {
                                childList = iPickerViewData.getChildList();
                            } else {
                                childList = null;
                            }
                            list3 = childList;
                            if (list3 != null) {
                                iPickerViewData2 = (IPickerViewData) CollectionsKt.firstOrNull(list2);
                                if (iPickerViewData2 != null) {
                                    childList2 = null;
                                } else {
                                    childList2 = null;
                                }
                                list4 = childList2;
                                if (list4 != null) {
                                    PickerView.f(dVar.f6095c, new g(this, 3), null, 6);
                                } else {
                                    PickerView.f(dVar.f6095c, new g(this, 3), null, 6);
                                }
                            } else {
                                iPickerViewData2 = (IPickerViewData) CollectionsKt.firstOrNull(list2);
                                if (iPickerViewData2 != null) {
                                    childList2 = null;
                                } else {
                                    childList2 = null;
                                }
                                list4 = childList2;
                                if (list4 != null) {
                                    PickerView.f(dVar.f6095c, new g(this, 3), null, 6);
                                } else {
                                    PickerView.f(dVar.f6095c, new g(this, 3), null, 6);
                                }
                            }
                        }
                    } else {
                        list2 = this.f11022e;
                        if (list2 != null) {
                            iPickerViewData = (IPickerViewData) CollectionsKt.firstOrNull(list2);
                            if (iPickerViewData != null) {
                                childList = iPickerViewData.getChildList();
                            } else {
                                childList = null;
                            }
                            list3 = childList;
                            if (list3 != null) {
                                iPickerViewData2 = (IPickerViewData) CollectionsKt.firstOrNull(list2);
                                if (iPickerViewData2 != null) {
                                    childList2 = null;
                                } else {
                                    childList2 = null;
                                }
                                list4 = childList2;
                                if (list4 != null) {
                                    PickerView.f(dVar.f6095c, new g(this, 3), null, 6);
                                } else {
                                    PickerView.f(dVar.f6095c, new g(this, 3), null, 6);
                                }
                            } else {
                                iPickerViewData2 = (IPickerViewData) CollectionsKt.firstOrNull(list2);
                                if (iPickerViewData2 != null) {
                                    childList2 = null;
                                } else {
                                    childList2 = null;
                                }
                                list4 = childList2;
                                if (list4 != null) {
                                    PickerView.f(dVar.f6095c, new g(this, 3), null, 6);
                                } else {
                                    PickerView.f(dVar.f6095c, new g(this, 3), null, 6);
                                }
                            }
                        }
                    }
                } else {
                    N6.d dVar3 = this.f11021d;
                    if (dVar3 != null) {
                        final int i10 = 0;
                        dVar3.f6095c.e(new g(this, 1), new Function1(this) { // from class: X6.h

                            /* JADX INFO: renamed from: b, reason: collision with root package name */
                            public final /* synthetic */ k f11014b;

                            {
                                this.f11014b = this;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                IPickerViewData iPickerViewData10;
                                List childList10;
                                IPickerViewData iPickerViewData11;
                                List childList11;
                                int i11 = i10;
                                int iIntValue = ((Integer) obj).intValue();
                                switch (i11) {
                                    case 0:
                                        k kVar = this.f11014b;
                                        List list6 = kVar.f11022e;
                                        if ((list6 != null ? list6.size() : 0) <= iIntValue) {
                                            return z.f38935a;
                                        }
                                        List list7 = kVar.f11022e;
                                        return (list7 == null || (iPickerViewData10 = (IPickerViewData) list7.get(iIntValue)) == null || (childList10 = iPickerViewData10.getChildList()) == null) ? z.f38935a : childList10;
                                    default:
                                        k kVar2 = this.f11014b;
                                        List list8 = kVar2.f11022e;
                                        if ((list8 != null ? list8.size() : 0) <= iIntValue) {
                                            return z.f38935a;
                                        }
                                        List list9 = kVar2.f11022e;
                                        return (list9 == null || (iPickerViewData11 = (IPickerViewData) list9.get(iIntValue)) == null || (childList11 = iPickerViewData11.getChildList()) == null) ? z.f38935a : childList11;
                                }
                            }
                        }, new Ba.a(this, 21));
                    }
                }
            }
        }
        N6.d dVar4 = this.f11021d;
        if (dVar4 != null) {
            dVar4.f6095c.b(this.f11024g);
        }
        TextView tvPositive = (TextView) binding.f6087c.f748b;
        Intrinsics.checkNotNullExpressionValue(tvPositive, "tvPositive");
        tvPositive.setOnClickListener(new V(7, tvPositive, gVar));
    }

    @Override // V6.a
    public final ViewBinding d() {
        return N6.b.a(getLayoutInflater());
    }
}
