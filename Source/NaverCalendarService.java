import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

/** NaverCalendarService - 껍데기 (Java8/Win7 호환, 캘린더 기능 비활성) */
public class NaverCalendarService {

    public String naverId       = "";
    public String naverPassword = "";

    public NaverCalendarService() {}
    public void setCredentials(String id, String password) {}
    public boolean isInitialized()                  { return false; }
    public static boolean credentialsExist(String id, String pass) { return false; }
    public boolean init()                           { return false; }
    public List<CalendarEvent> getToday()           { return new ArrayList<CalendarEvent>(); }
    public List<CalendarEvent> getNextDays(int days){ return new ArrayList<CalendarEvent>(); }
    public List<CalendarEvent> getPastDays(int days){ return new ArrayList<CalendarEvent>(); }
    public List<CalendarEvent> getThisWeek()        { return new ArrayList<CalendarEvent>(); }
    public List<CalendarEvent> getThisMonth()       { return new ArrayList<CalendarEvent>(); }
    public List<CalendarEvent> getNextMonth()       { return new ArrayList<CalendarEvent>(); }
    public List<CalendarEvent> getUpcomingAlarms(int withinMinutes) { return new ArrayList<CalendarEvent>(); }
    public static String formatEvents(String title, List<CalendarEvent> events) { return ""; }
    public void cleanup() {}

    public static class CalendarEvent {
        public final String        id;
        public final String        title;
        public final ZonedDateTime startTime;
        public final ZonedDateTime endTime;
        public final boolean       allDay;

        public CalendarEvent(String id, String title,
                             ZonedDateTime startTime, ZonedDateTime endTime,
                             boolean allDay) {
            this.id        = id;
            this.title     = title;
            this.startTime = startTime;
            this.endTime   = endTime;
            this.allDay    = allDay;
        }
    }
}
