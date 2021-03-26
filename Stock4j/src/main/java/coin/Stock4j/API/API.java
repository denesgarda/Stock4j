package coin.Stock4j.API;

import coin.Stock4j.API.event.MarketUpdateEvent;
import coin.Stock4j.API.event.MarketUpdatePerHourEvent;
import coin.Stock4j.API.event.MarketUpdatePerSecondEvent;
import coin.Stock4j.API.event.MarketUpdatePerTenMinutesEvent;
import coin.Stock4j.lang.APINotFoundException;
import coin.Stock4j.lang.NoSuchEventException;
import jdk.jfr.Name;

import java.lang.reflect.Method;
import java.util.Timer;
import java.util.TimerTask;

public class API {
    protected static TimerTask timerTask;
    public API() {

    }
    /**
     * @deprecated
     * Method will be renamed to start()
     **/
    public void await(String methodName, String className) throws ClassNotFoundException, NoSuchMethodException {
        Class c = Class.forName(className);
        final Object marketUpdateEvent = new MarketUpdateEvent();
        final Object marketUpdatePerSecondEvent = new MarketUpdatePerSecondEvent();
        final Object marketUpdatePerTenMinutesEvent = new MarketUpdatePerTenMinutesEvent();
        final Object marketUpdatePerHourEvent = new MarketUpdatePerHourEvent();
        Method method;
        try {
            method = c.getMethod(methodName, marketUpdateEvent.getClass());
            Timer timer = new Timer();
            Method finalMethod = method;
            timerTask = new TimerTask() {
                @Override
                public void run() {
                    try {
                        finalMethod.invoke(c.newInstance(), marketUpdateEvent);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            };
            timer.scheduleAtFixedRate(timerTask, 0, 60000);
        }
        catch(Exception e1) {
            try {
                method = c.getMethod(methodName, marketUpdatePerSecondEvent.getClass());
                Timer timer = new Timer();
                Method finalMethod1 = method;
                timerTask = new TimerTask() {
                    @Override
                    public void run() {
                        try {
                            finalMethod1.invoke(c.newInstance(), marketUpdatePerSecondEvent);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                };
                timer.scheduleAtFixedRate(timerTask, 0, 1000);
            }
            catch(Exception e2) {
                try {
                    method = c.getMethod(methodName, marketUpdatePerTenMinutesEvent.getClass());
                    Timer timer = new Timer();
                    Method finalMethod1 = method;
                    timerTask = new TimerTask() {
                        @Override
                        public void run() {
                            try {
                                finalMethod1.invoke(c.newInstance(), marketUpdatePerTenMinutesEvent);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    };
                    timer.scheduleAtFixedRate(timerTask, 0, 600000);
                }
                catch(Exception e3) {
                    try {
                        method = c.getMethod(methodName, marketUpdatePerHourEvent.getClass());
                        Timer timer = new Timer();
                        Method finalMethod1 = method;
                        timerTask = new TimerTask() {
                            @Override
                            public void run() {
                                try {
                                    finalMethod1.invoke(c.newInstance(), marketUpdatePerHourEvent);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        };
                        timer.scheduleAtFixedRate(timerTask, 0, 3600000);
                    }
                    catch(Exception e4) {
                        throw new NoSuchEventException("Said event cannot be found.");
                    }
                }
            }
        }
    }
    public void end(int exitCode) {
        System.exit(exitCode);
    }
    public void end() {
        System.exit(1);
    }
}
