//Шаблон Singleton:
//Реализуйте паттерн Singleton на языке Python (сделала на Java) для класса Logger,
// который будет использоваться для логирования информации в приложении.
// Гарантируйте, что только один экземпляр класса Logger будет создан.

package HW3.Part1;

public class Logger {
    private static Logger logger;

    private Logger() {}

    private static Logger getInstance(){
        if(logger == null){
            logger = new Logger();
        }
        return logger;
    }

    public void Log(String msg){
        System.out.println(msg);
    }
}
