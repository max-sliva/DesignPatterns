package Java.Lab8_Threads;

import java.io.File;

public class TimetableTrainsProxy implements TimeTable {
    // Ссылка на оригинальный объект
    private TimeTable timetableTrains = new TimetableTrains();

    private String[] timetableCache = null;

    @Override
    public String[] getTimetable() {
        if(timetableCache == null) {
            timetableCache = timetableTrains.getTimetable();
        }
        return timetableCache;
    }

    @Override
    public String getTrainDepartureTime(String trainId) {
        if(timetableCache == null) {
            timetableCache = timetableTrains.getTimetable();
        }
        for(int i = 0; i < timetableCache.length; i++) {
            if(timetableCache[i].startsWith(trainId+";")) return timetableCache[i];
        }
        return "";
    }

    public void clearCache() {
        timetableTrains = null;
    }

    @Override
    public String getTimetableInfo(){
        return timetableTrains.getTimetableInfo();
    }

    @Override
    public File getFile() {
        return timetableTrains.getFile();
    }

}
