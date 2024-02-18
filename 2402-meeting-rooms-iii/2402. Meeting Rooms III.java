class Solution {
    public int mostBooked(int n, int[][] meetings) {
        long room_availability_time[] = new long[n];
        int meeting_count[] = new int[n];
        Arrays.sort(meetings,(a,b) -> Integer.compare(a[0] ,b[0]));
        for(int[] meeting : meetings){
            int start = meeting[0],end = meeting[1];
            long minRoomAvailabilityTime = Long.MAX_VALUE;
            int minAvailableTimeRoom = 0;
            boolean foundUnusedRoom = false;
            for(int i = 0 ; i < n ; i++){
                if(room_availability_time[i] <= start){
                    foundUnusedRoom = true;
                    meeting_count[i]++;
                    room_availability_time[i] = end;
                    break;
                }
                if(minRoomAvailabilityTime > room_availability_time[i]){
                    minRoomAvailabilityTime = room_availability_time[i];
                    minAvailableTimeRoom = i;
                }
            }
            if(!foundUnusedRoom){
                room_availability_time[minAvailableTimeRoom] += end -start;
                meeting_count[minAvailableTimeRoom]++;
            }
        }
        int maxMeetingCount = 0 ,maxMeetingCountRoom = 0;
        for(int i = 0 ; i < n ;i++){
            if(meeting_count[i] > maxMeetingCount){
                maxMeetingCount = meeting_count[i];
                maxMeetingCountRoom = i;
            }
        }
        return maxMeetingCountRoom;
    }
}