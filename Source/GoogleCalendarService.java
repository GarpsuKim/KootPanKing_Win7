import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;

/** GoogleCalendarService - 껍데기 (Java8/Win7 호환, 캘린더 기능 비활성) */
public class GoogleCalendarService {

    public String appDir = "";

    public void setAppDir(String dir)               { this.appDir = dir; }
    public boolean init()                           { return false; }
    public boolean isInitialized()                  { return false; }
    public boolean credentialsExist()               { return false; }
    public static boolean credentialsExist(String settingsDirPath) { return false; }
    public String logout()                          { return ""; }
    public List<CalendarEvent> getToday()           { return new ArrayList<CalendarEvent>(); }
    public List<CalendarEvent> getNextDays(int days){ return new ArrayList<CalendarEvent>(); }
    public List<CalendarEvent> getPastDays(int days){ return new ArrayList<CalendarEvent>(); }
    public List<CalendarEvent> getThisWeek()        { return new ArrayList<CalendarEvent>(); }
    public List<CalendarEvent> getThisMonth()       { return new ArrayList<CalendarEvent>(); }
    public List<CalendarEvent> getNextMonth()       { return new ArrayList<CalendarEvent>(); }
    public List<CalendarEvent> getUpcomingAlarms(int withinMinutes) { return new ArrayList<CalendarEvent>(); }
    public static String formatEvents(String title, List<CalendarEvent> events) { return ""; }

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
