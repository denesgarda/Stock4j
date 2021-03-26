package coin.Stock4j.API.event;

import coin.Stock4j.data.statics.TimeType;

import java.sql.Date;
import java.sql.Time;
import java.time.Duration;
import java.time.LocalDate;

public class MarketUpdateEvent extends Event{
    public MarketUpdateEvent() {
        super();
    }
}
