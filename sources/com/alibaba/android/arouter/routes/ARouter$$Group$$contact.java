package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.transsnet.palmpay.contacts.ui.activity.AddContactActivity;
import com.transsnet.palmpay.contacts.ui.activity.AddNewFaveActivity;
import com.transsnet.palmpay.contacts.ui.activity.AllContactsActivity;
import com.transsnet.palmpay.contacts.ui.activity.AllContactsSearchActivity;
import com.transsnet.palmpay.contacts.ui.activity.CloseContactsActivity;
import com.transsnet.palmpay.contacts.ui.activity.ContactProfileActivity;
import com.transsnet.palmpay.contacts.ui.activity.ContactSearchOrScanResultActivity;
import com.transsnet.palmpay.contacts.ui.activity.EditCloseContactsActivity;
import com.transsnet.palmpay.contacts.ui.activity.FindInviteFriendsActivity;
import com.transsnet.palmpay.contacts.ui.activity.LinkFaveNoticeListActivity;
import com.transsnet.palmpay.contacts.ui.activity.LinkFavePersonalInfoActivity;
import com.transsnet.palmpay.contacts.ui.activity.LocalContactsListActivity;
import com.transsnet.palmpay.contacts.ui.activity.LocalPalmPayContactsListActivity;
import com.transsnet.palmpay.contacts.ui.activity.PalmPayLinkFavesFriendsActivity;
import com.transsnet.palmpay.contacts.ui.activity.PalmPayNewContactsListActivity;
import com.transsnet.palmpay.contacts.ui.activity.PersonalQRCodeActivity;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ARouter$$Group$$contact implements IRouteGroup {

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$contact$1, reason: invalid class name */
    public class AnonymousClass1 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$contact$2, reason: invalid class name */
    public class AnonymousClass2 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$contact$3, reason: invalid class name */
    public class AnonymousClass3 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$contact$4, reason: invalid class name */
    public class AnonymousClass4 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$contact$5, reason: invalid class name */
    public class AnonymousClass5 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$contact$6, reason: invalid class name */
    public class AnonymousClass6 extends HashMap<String, Integer> {
    }

    /* JADX INFO: renamed from: com.alibaba.android.arouter.routes.ARouter$$Group$$contact$7, reason: invalid class name */
    public class AnonymousClass7 extends HashMap<String, Integer> {
    }

    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> atlas) {
        RouteType routeType = RouteType.ACTIVITY;
        atlas.put("/contact/add", RouteMeta.build(routeType, AddContactActivity.class, "/contact/add", "contact", null, -1, Integer.MIN_VALUE));
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        anonymousClass1.put("key_phone", 8);
        anonymousClass1.put("key_binding_memberid", 8);
        anonymousClass1.put("key_final_source", 8);
        atlas.put("/contact/add_new_fave", RouteMeta.build(routeType, AddNewFaveActivity.class, "/contact/add_new_fave", "contact", anonymousClass1, -1, Integer.MIN_VALUE));
        AnonymousClass2 anonymousClass2 = new AnonymousClass2();
        anonymousClass2.put("orderType", 8);
        anonymousClass2.put("transType", 8);
        anonymousClass2.put("CLICK_ITEM_TO_FOR_RESULT", 0);
        anonymousClass2.put("key_select_phone", 0);
        atlas.put("/contact/all", RouteMeta.build(routeType, AllContactsActivity.class, "/contact/all", "contact", anonymousClass2, -1, Integer.MIN_VALUE));
        AnonymousClass3 anonymousClass3 = new AnonymousClass3();
        anonymousClass3.put("key_select_phone", 0);
        atlas.put("/contact/close_contact", RouteMeta.build(routeType, CloseContactsActivity.class, "/contact/close_contact", "contact", anonymousClass3, -1, Integer.MIN_VALUE));
        AnonymousClass4 anonymousClass4 = new AnonymousClass4();
        anonymousClass4.put("KEY_EDIT_MODEL", 3);
        anonymousClass4.put("KEY_CONTACT_BEAN", 10);
        atlas.put("/contact/edit_close_contact", RouteMeta.build(routeType, EditCloseContactsActivity.class, "/contact/edit_close_contact", "contact", anonymousClass4, -1, Integer.MIN_VALUE));
        atlas.put("/contact/find_my_friends", RouteMeta.build(routeType, FindInviteFriendsActivity.class, "/contact/find_my_friends", "contact", null, -1, Integer.MIN_VALUE));
        AnonymousClass5 anonymousClass5 = new AnonymousClass5();
        anonymousClass5.put("memberId", 8);
        atlas.put("/contact/link_fave_notice_list", RouteMeta.build(routeType, LinkFaveNoticeListActivity.class, "/contact/link_fave_notice_list", "contact", anonymousClass5, -1, Integer.MIN_VALUE));
        AnonymousClass6 anonymousClass6 = new AnonymousClass6();
        anonymousClass6.put("key_phone", 8);
        anonymousClass6.put("key_binding_memberid", 8);
        atlas.put("/contact/link_fave_personal_info", RouteMeta.build(routeType, LinkFavePersonalInfoActivity.class, "/contact/link_fave_personal_info", "contact", anonymousClass6, -1, Integer.MIN_VALUE));
        atlas.put("/contact/local", RouteMeta.build(routeType, LocalContactsListActivity.class, "/contact/local", "contact", null, -1, Integer.MIN_VALUE));
        atlas.put("/contact/local_palmpay_contacts", RouteMeta.build(routeType, LocalPalmPayContactsListActivity.class, "/contact/local_palmpay_contacts", "contact", null, -1, Integer.MIN_VALUE));
        atlas.put("/contact/new_contacts_list", RouteMeta.build(routeType, PalmPayNewContactsListActivity.class, "/contact/new_contacts_list", "contact", null, -1, Integer.MIN_VALUE));
        atlas.put("/contact/palmpay_list", RouteMeta.build(routeType, PalmPayLinkFavesFriendsActivity.class, "/contact/palmpay_list", "contact", null, -1, Integer.MIN_VALUE));
        atlas.put("/contact/personal_qrcode", RouteMeta.build(routeType, PersonalQRCodeActivity.class, "/contact/personal_qrcode", "contact", null, -1, Integer.MIN_VALUE));
        atlas.put("/contact/profile", RouteMeta.build(routeType, ContactProfileActivity.class, "/contact/profile", "contact", null, -1, Integer.MIN_VALUE));
        atlas.put("/contact/seach_all_contact", RouteMeta.build(routeType, AllContactsSearchActivity.class, "/contact/seach_all_contact", "contact", null, -1, Integer.MIN_VALUE));
        AnonymousClass7 anonymousClass7 = new AnonymousClass7();
        anonymousClass7.put("MEMBER_ID", 8);
        atlas.put("/contact/search_san_result", RouteMeta.build(routeType, ContactSearchOrScanResultActivity.class, "/contact/search_san_result", "contact", anonymousClass7, -1, Integer.MIN_VALUE));
    }
}
