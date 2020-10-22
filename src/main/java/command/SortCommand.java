package command;

import eventlist.EventList;
import locationlist.BusStopList;
import locationlist.LocationList;
import storage.Storage;
import ui.UI;

public class SortCommand extends Command {
    private final String type;

    public SortCommand(String type) {
        this.type = type;
    }

    @Override
    public void execute(EventList events, LocationList locations, BusStopList busStops, UI ui, Storage storage) {
        events.sortEvent(type);
        ui.printSortEventMessage();
    }
}