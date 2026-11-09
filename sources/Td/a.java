package Td;

import V0.C0689h;
import V0.C0693l;
import V0.C0695n;
import V0.EnumC0682a;
import V0.K;
import androidx.room.AbstractC1236o;
import androidx.room.G;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.work.impl.model.d;
import androidx.work.impl.model.f;
import androidx.work.impl.model.g;
import androidx.work.impl.model.k;
import androidx.work.impl.model.o;
import com.transsnet.adsdk.data.local.entity.AdEntity;
import com.transsnet.analysis.data.local.entity.EventsEntity;
import com.transsnet.palmpay.core.db.entity.RequestContact;
import kotlin.jvm.internal.Intrinsics;
import p355xf.l;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends AbstractC1236o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9071d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(G g7, int i7) {
        super(g7);
        this.f9071d = i7;
    }

    @Override // androidx.room.P
    public final String b() {
        switch (this.f9071d) {
            case 0:
                return "INSERT OR ABORT INTO `biller_search_record` (`recordId`,`memberId`,`searchText`,`updateTime`) VALUES (nullif(?, 0),?,?,?)";
            case 1:
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            case 2:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            case 3:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            case 4:
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            case 5:
                return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
            case 6:
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 7:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
            case 8:
                return "INSERT OR REPLACE INTO `ad_detail` (`ad_id`,`application_id`,`ad_slot_id`,`image_url`,`image_url_dark`,`secondary_image_url`,`secondary_image_url_dark`,`jump_type`,`relative_url`,`image_dimention`,`country_code`,`valid_start_time`,`valid_end_time`,`show_times`,`show_times_condition`,`click_frequency`,`max_close_count`,`show_dates`,`multiple_imageUrl`,`text_content`,`text_font_size`,`text_font_color`,`text_font_color_dark`,`text_scroll_speed`,`background_color`,`background_color_dark`,`ad_type`,`native_ad_title`,`native_ad_content`,`native_ad_photo`,`show_close_button`,`has_show_times`,`show_date`,`click_date`,`close_time`,`close_count`,`create_time`,`update_time`,`current_enable`,`jump_params`,`default_img_res`,`text_icon_url`,`text_icon_url_dark`,`alpha`,`display_order`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            case 9:
                return "INSERT OR REPLACE INTO `request_contacts` (`contact_member_id`,`alias`,`full_name`,`is_favourite`,`is_friend`,`phone`,`photo_path`,`request_source`,`create_time`,`update_time`,`expire_time`,`own_member_id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            default:
                return "INSERT OR ABORT INTO `events` (`id`,`data`,`create_time`,`type`) VALUES (nullif(?, 0),?,?,?)";
        }
    }

    @Override // androidx.room.AbstractC1236o
    public final void d(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
        int i7;
        switch (this.f9071d) {
            case 0:
                Ud.a aVar = (Ud.a) obj;
                supportSQLiteStatement.bindLong(1, aVar.f9750a);
                supportSQLiteStatement.bindString(2, aVar.f9751b);
                supportSQLiteStatement.bindString(3, aVar.f9752c);
                supportSQLiteStatement.bindLong(4, aVar.f9753d);
                return;
            case 1:
                androidx.work.impl.model.a aVar2 = (androidx.work.impl.model.a) obj;
                supportSQLiteStatement.bindString(1, aVar2.f18574a);
                supportSQLiteStatement.bindString(2, aVar2.f18575b);
                return;
            case 2:
                androidx.work.impl.model.c cVar = (androidx.work.impl.model.c) obj;
                supportSQLiteStatement.bindString(1, cVar.f18582a);
                supportSQLiteStatement.bindLong(2, cVar.f18583b.longValue());
                return;
            case 3:
                d dVar = (d) obj;
                supportSQLiteStatement.bindString(1, dVar.f18584a);
                supportSQLiteStatement.bindLong(2, dVar.f18585b);
                supportSQLiteStatement.bindLong(3, dVar.f18586c);
                return;
            case 4:
                f fVar = (f) obj;
                supportSQLiteStatement.bindString(1, fVar.f18589a);
                supportSQLiteStatement.bindString(2, fVar.f18590b);
                return;
            case 5:
                ((g) obj).getClass();
                supportSQLiteStatement.bindString(1, null);
                supportSQLiteStatement.bindBlob(2, C0695n.f9956b.toByteArrayInternalV1(null));
                return;
            case 6:
                k kVar = (k) obj;
                int i10 = 1;
                supportSQLiteStatement.bindString(1, kVar.f18612a);
                supportSQLiteStatement.bindLong(2, org.chromium.support_lib_boundary.util.b.n0(kVar.f18613b));
                supportSQLiteStatement.bindString(3, kVar.f18614c);
                supportSQLiteStatement.bindString(4, kVar.f18615d);
                C0695n c0695n = kVar.f18616e;
                C0693l c0693l = C0695n.f9956b;
                supportSQLiteStatement.bindBlob(5, c0693l.toByteArrayInternalV1(c0695n));
                supportSQLiteStatement.bindBlob(6, c0693l.toByteArrayInternalV1(kVar.f18617f));
                supportSQLiteStatement.bindLong(7, kVar.f18618g);
                supportSQLiteStatement.bindLong(8, kVar.f18619h);
                supportSQLiteStatement.bindLong(9, kVar.f18620i);
                supportSQLiteStatement.bindLong(10, kVar.f18622k);
                EnumC0682a backoffPolicy = kVar.f18623l;
                Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
                int iOrdinal = backoffPolicy.ordinal();
                if (iOrdinal == 0) {
                    i7 = 0;
                } else {
                    if (iOrdinal != 1) {
                        throw new l();
                    }
                    i7 = 1;
                }
                supportSQLiteStatement.bindLong(11, i7);
                supportSQLiteStatement.bindLong(12, kVar.f18624m);
                supportSQLiteStatement.bindLong(13, kVar.f18625n);
                supportSQLiteStatement.bindLong(14, kVar.f18626o);
                supportSQLiteStatement.bindLong(15, kVar.f18627p);
                supportSQLiteStatement.bindLong(16, kVar.f18628q ? 1L : 0L);
                K policy = kVar.f18629r;
                Intrinsics.checkNotNullParameter(policy, "policy");
                int iOrdinal2 = policy.ordinal();
                if (iOrdinal2 == 0) {
                    i10 = 0;
                } else if (iOrdinal2 != 1) {
                    throw new l();
                }
                supportSQLiteStatement.bindLong(17, i10);
                supportSQLiteStatement.bindLong(18, kVar.f18630s);
                supportSQLiteStatement.bindLong(19, kVar.t);
                supportSQLiteStatement.bindLong(20, kVar.f18631u);
                supportSQLiteStatement.bindLong(21, kVar.f18632v);
                supportSQLiteStatement.bindLong(22, kVar.f18633w);
                String str = kVar.f18634x;
                if (str == null) {
                    supportSQLiteStatement.bindNull(23);
                } else {
                    supportSQLiteStatement.bindString(23, str);
                }
                C0689h c0689h = kVar.f18621j;
                supportSQLiteStatement.bindLong(24, org.chromium.support_lib_boundary.util.b.U(c0689h.f9940a));
                supportSQLiteStatement.bindBlob(25, org.chromium.support_lib_boundary.util.b.x(c0689h.f9941b));
                supportSQLiteStatement.bindLong(26, c0689h.f9942c ? 1L : 0L);
                supportSQLiteStatement.bindLong(27, c0689h.f9943d ? 1L : 0L);
                supportSQLiteStatement.bindLong(28, c0689h.f9944e ? 1L : 0L);
                supportSQLiteStatement.bindLong(29, c0689h.f9945f ? 1L : 0L);
                supportSQLiteStatement.bindLong(30, c0689h.f9946g);
                supportSQLiteStatement.bindLong(31, c0689h.f9947h);
                supportSQLiteStatement.bindBlob(32, org.chromium.support_lib_boundary.util.b.e0(c0689h.f9948i));
                return;
            case 7:
                o oVar = (o) obj;
                supportSQLiteStatement.bindString(1, oVar.f18658a);
                supportSQLiteStatement.bindString(2, oVar.f18659b);
                return;
            case 8:
                AdEntity adEntity = (AdEntity) obj;
                String str2 = adEntity.adId;
                if (str2 == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, str2);
                }
                String str3 = adEntity.applicationId;
                if (str3 == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, str3);
                }
                String str4 = adEntity.adSlotId;
                if (str4 == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, str4);
                }
                String str5 = adEntity.imageUrl;
                if (str5 == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, str5);
                }
                String str6 = adEntity.imageUrlDark;
                if (str6 == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, str6);
                }
                String str7 = adEntity.h5ImageUrl;
                if (str7 == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, str7);
                }
                String str8 = adEntity.h5ImageUrlDark;
                if (str8 == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindString(7, str8);
                }
                String str9 = adEntity.jumpType;
                if (str9 == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindString(8, str9);
                }
                String str10 = adEntity.relativeUrl;
                if (str10 == null) {
                    supportSQLiteStatement.bindNull(9);
                } else {
                    supportSQLiteStatement.bindString(9, str10);
                }
                String str11 = adEntity.imageDimention;
                if (str11 == null) {
                    supportSQLiteStatement.bindNull(10);
                } else {
                    supportSQLiteStatement.bindString(10, str11);
                }
                String str12 = adEntity.countryCode;
                if (str12 == null) {
                    supportSQLiteStatement.bindNull(11);
                } else {
                    supportSQLiteStatement.bindString(11, str12);
                }
                supportSQLiteStatement.bindLong(12, adEntity.validStartTime);
                supportSQLiteStatement.bindLong(13, adEntity.validEndTime);
                supportSQLiteStatement.bindLong(14, adEntity.showTimes);
                Integer num = adEntity.showTimesCondition;
                if (num == null) {
                    supportSQLiteStatement.bindNull(15);
                } else {
                    supportSQLiteStatement.bindLong(15, num.intValue());
                }
                Integer num2 = adEntity.clickFrequency;
                if (num2 == null) {
                    supportSQLiteStatement.bindNull(16);
                } else {
                    supportSQLiteStatement.bindLong(16, num2.intValue());
                }
                supportSQLiteStatement.bindLong(17, adEntity.closeControl);
                String str13 = adEntity.showDates;
                if (str13 == null) {
                    supportSQLiteStatement.bindNull(18);
                } else {
                    supportSQLiteStatement.bindString(18, str13);
                }
                String str14 = adEntity.multipleImageUrl;
                if (str14 == null) {
                    supportSQLiteStatement.bindNull(19);
                } else {
                    supportSQLiteStatement.bindString(19, str14);
                }
                String str15 = adEntity.textContent;
                if (str15 == null) {
                    supportSQLiteStatement.bindNull(20);
                } else {
                    supportSQLiteStatement.bindString(20, str15);
                }
                String str16 = adEntity.textFontSize;
                if (str16 == null) {
                    supportSQLiteStatement.bindNull(21);
                } else {
                    supportSQLiteStatement.bindString(21, str16);
                }
                String str17 = adEntity.textFontColor;
                if (str17 == null) {
                    supportSQLiteStatement.bindNull(22);
                } else {
                    supportSQLiteStatement.bindString(22, str17);
                }
                String str18 = adEntity.textFontColorDark;
                if (str18 == null) {
                    supportSQLiteStatement.bindNull(23);
                } else {
                    supportSQLiteStatement.bindString(23, str18);
                }
                String str19 = adEntity.textScrollSpeed;
                if (str19 == null) {
                    supportSQLiteStatement.bindNull(24);
                } else {
                    supportSQLiteStatement.bindString(24, str19);
                }
                String str20 = adEntity.backgroundColor;
                if (str20 == null) {
                    supportSQLiteStatement.bindNull(25);
                } else {
                    supportSQLiteStatement.bindString(25, str20);
                }
                String str21 = adEntity.backgroundColorDark;
                if (str21 == null) {
                    supportSQLiteStatement.bindNull(26);
                } else {
                    supportSQLiteStatement.bindString(26, str21);
                }
                supportSQLiteStatement.bindLong(27, adEntity.adType);
                String str22 = adEntity.nativeAdTitle;
                if (str22 == null) {
                    supportSQLiteStatement.bindNull(28);
                } else {
                    supportSQLiteStatement.bindString(28, str22);
                }
                String str23 = adEntity.nativeAdContent;
                if (str23 == null) {
                    supportSQLiteStatement.bindNull(29);
                } else {
                    supportSQLiteStatement.bindString(29, str23);
                }
                String str24 = adEntity.nativeAdPhoto;
                if (str24 == null) {
                    supportSQLiteStatement.bindNull(30);
                } else {
                    supportSQLiteStatement.bindString(30, str24);
                }
                supportSQLiteStatement.bindLong(31, adEntity.showCloseButton);
                supportSQLiteStatement.bindLong(32, adEntity.hasShowTimes);
                supportSQLiteStatement.bindLong(33, adEntity.showDate);
                supportSQLiteStatement.bindLong(34, adEntity.clickDate);
                supportSQLiteStatement.bindLong(35, adEntity.closeTime);
                supportSQLiteStatement.bindLong(36, adEntity.closeCount);
                supportSQLiteStatement.bindLong(37, adEntity.createTime);
                supportSQLiteStatement.bindLong(38, adEntity.updateTime);
                supportSQLiteStatement.bindLong(39, adEntity.curEnable);
                String str25 = adEntity.jumpParams;
                if (str25 == null) {
                    supportSQLiteStatement.bindNull(40);
                } else {
                    supportSQLiteStatement.bindString(40, str25);
                }
                supportSQLiteStatement.bindLong(41, adEntity.defaultImgRes);
                String str26 = adEntity.textIconUrl;
                if (str26 == null) {
                    supportSQLiteStatement.bindNull(42);
                } else {
                    supportSQLiteStatement.bindString(42, str26);
                }
                String str27 = adEntity.textIconUrlDark;
                if (str27 == null) {
                    supportSQLiteStatement.bindNull(43);
                } else {
                    supportSQLiteStatement.bindString(43, str27);
                }
                supportSQLiteStatement.bindLong(44, adEntity.alpha);
                supportSQLiteStatement.bindLong(45, adEntity.displayOrder);
                return;
            case 9:
                RequestContact requestContact = (RequestContact) obj;
                supportSQLiteStatement.bindString(1, requestContact.getContactsMemberId());
                if (requestContact.getAlias() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, requestContact.getAlias());
                }
                if (requestContact.getFullName() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, requestContact.getFullName());
                }
                if (requestContact.getIsFavourite() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, requestContact.getIsFavourite());
                }
                supportSQLiteStatement.bindLong(5, requestContact.isFriend() ? 1L : 0L);
                if (requestContact.getPhone() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, requestContact.getPhone());
                }
                if (requestContact.getPhotoPath() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindString(7, requestContact.getPhotoPath());
                }
                if (requestContact.getRequestSource() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindString(8, requestContact.getRequestSource());
                }
                supportSQLiteStatement.bindLong(9, requestContact.getCreateTime());
                supportSQLiteStatement.bindLong(10, requestContact.getUpdateTime());
                supportSQLiteStatement.bindLong(11, requestContact.getExpireTime());
                supportSQLiteStatement.bindString(12, requestContact.getMemberId());
                return;
            default:
                EventsEntity eventsEntity = (EventsEntity) obj;
                supportSQLiteStatement.bindLong(1, eventsEntity.f25682id);
                String str28 = eventsEntity.data;
                if (str28 == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, str28);
                }
                supportSQLiteStatement.bindLong(3, eventsEntity.create_time);
                supportSQLiteStatement.bindLong(4, eventsEntity.type);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(G database, int i7, boolean z3) {
        super(database);
        this.f9071d = i7;
        Intrinsics.checkNotNullParameter(database, "database");
    }
}
