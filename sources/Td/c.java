package Td;

import androidx.room.G;
import androidx.room.P;
import com.google.api.Service;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends P {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9073d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(G g7, int i7) {
        super(g7);
        this.f9073d = i7;
    }

    @Override // androidx.room.P
    public final String b() {
        switch (this.f9073d) {
            case 0:
                return "DELETE FROM biller_search_record WHERE memberId LIKE ?";
            case 1:
                return "DELETE FROM biller_search_record WHERE searchText LIKE ?";
            case 2:
                return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
            case 3:
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            case 4:
                return "DELETE from WorkProgress where work_spec_id=?";
            case 5:
                return "DELETE FROM WorkProgress";
            case 6:
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            case 7:
                return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
            case 8:
                return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
            case 9:
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            case 10:
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            case 11:
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            case 12:
                return "UPDATE workspec SET generation=generation+1 WHERE id=?";
            case 13:
                return "UPDATE workspec SET stop_reason=? WHERE id=?";
            case 14:
                return "DELETE FROM workspec WHERE id=?";
            case 15:
                return "UPDATE workspec SET state=? WHERE id=?";
            case 16:
                return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
            case 17:
                return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
            case 18:
                return "UPDATE workspec SET output=? WHERE id=?";
            case 19:
                return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
            case 20:
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            case 21:
                return "DELETE FROM worktag WHERE work_spec_id=?";
            case 22:
                return "DELETE FROM ad_detail WHERE ad_slot_id == (?)";
            case 23:
                return "DELETE FROM ad_detail WHERE ad_id == (?)";
            case 24:
                return "UPDATE ad_detail SET current_enable = 1 WHERE current_enable = 0 AND ad_slot_id == (?)";
            case Service.MONITORED_RESOURCES_FIELD_NUMBER /* 25 */:
                return "UPDATE ad_detail SET current_enable = 0 WHERE current_enable = 1 AND ad_slot_id == (?)";
            case 26:
                return "UPDATE ad_detail SET current_enable = 0 WHERE current_enable = 1";
            case 27:
                return "DELETE FROM ad_detail";
            default:
                return "DELETE FROM request_contacts WHERE own_member_id = ? AND contact_member_id = ?";
        }
    }
}
