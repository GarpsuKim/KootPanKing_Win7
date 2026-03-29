/** CalendarAlarmPoller - 껍데기 (Java8/Win7 호환, 캘린더 기능 비활성) */
public class CalendarAlarmPoller {

    public interface HostCallback {
        String getTelegramChatId();
        void prepareMessageBox();
        void setBgColorAndRepaint(java.awt.Color c);
        void restoreBgColor();
        int getRainbowSeconds();
        int getMorningBriefTime();
    }

    public CalendarAlarmPoller(GoogleCalendarService googleCalendar,
                               NaverCalendarService  naverCalendar,
                               TelegramBot           telegramBot,
                               HostCallback          host) {}

    public CalendarAlarmPoller(GoogleCalendarService googleCalendar,
                               TelegramBot           telegramBot,
                               HostCallback          host) {}

    public void start()             {}
    public void stop()              {}
    public boolean isRunning()      { return false; }
    public void sendStartupBrief()  {}
}
