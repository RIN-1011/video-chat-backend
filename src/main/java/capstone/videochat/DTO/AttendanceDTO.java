package capstone.videochat.DTO;

public class AttendanceDTO {

    String meetingRoomNum; //미팅룸 번호
    String userId; //user id

    public String getMeetingRoomNum() {
        return meetingRoomNum;
    }

    public void setMeetingRoomNum(String meetingRoomNum) {
        this.meetingRoomNum = meetingRoomNum;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

}
