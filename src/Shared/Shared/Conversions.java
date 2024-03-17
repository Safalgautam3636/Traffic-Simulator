package Shared;

public class Conversions
{
        public static int WCpointToCCpoint(double val)
        {
            return (int)(val * (Constants.CharMapSize / Constants.WorldSize) + (Constants.CharMapSize / 2));
        }

        public static int WClengthToCClength(double val)
        {
            return (int)(val * (Constants.CharMapSize / Constants.WorldSize));
        }
}
