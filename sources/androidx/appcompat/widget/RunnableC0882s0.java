package androidx.appcompat.widget;

/* JADX INFO: renamed from: androidx.appcompat.widget.s0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0882s0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ListPopupWindow f13002b;

    public /* synthetic */ RunnableC0882s0(ListPopupWindow listPopupWindow, int i7) {
        this.f13001a = i7;
        this.f13002b = listPopupWindow;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13001a) {
            case 0:
                DropDownListView dropDownListView = this.f13002b.f12714c;
                if (dropDownListView != null) {
                    dropDownListView.setListSelectionHidden(true);
                    dropDownListView.requestLayout();
                }
                break;
            default:
                ListPopupWindow listPopupWindow = this.f13002b;
                DropDownListView dropDownListView2 = listPopupWindow.f12714c;
                if (dropDownListView2 != null && dropDownListView2.isAttachedToWindow() && listPopupWindow.f12714c.getCount() > listPopupWindow.f12714c.getChildCount() && listPopupWindow.f12714c.getChildCount() <= listPopupWindow.f12725v) {
                    listPopupWindow.f12724p0.setInputMethodMode(2);
                    listPopupWindow.show();
                    break;
                }
                break;
        }
    }
}
