package Lab4;

public class FactoryMaker
{
    //Object used for singleton instantiation locking
    private static final Object INSTANCE_LOCK = new Object();

    //The single instance of this class
    private static FactoryMaker myInstance = null;

    public static enum Mode
    {
        BEGINNER, INTERMEDIATE, ADVANCED;
    }

    private FactoryMaker()
    {
        //use private constructor to limit factory maker creation
    }//private constructor

    public static FactoryMaker getInstance()
    {
        synchronized(INSTANCE_LOCK)
        {
            if (myInstance == null)
                myInstance = new FactoryMaker();
        }
        return myInstance;
    }//getInstance()

    //Return new object that implements the ModeFactoryIF for given type.
    public ModeFactoryIF createFactory(Mode mode)
    {
        switch (mode) {
            case BEGINNER:
                return new BeginnerFactory();
            case INTERMEDIATE:
                return new IntermediateFactory();
            case ADVANCED:
                return new AdvancedFactory();
            default:
                String errMsg = mode.name();
                throw new IllegalArgumentException(errMsg);
        }
    }
}
