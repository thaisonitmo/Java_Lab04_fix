package Actions.Current;

public class Shouting extends ActionCurrent {
    @Override
    public boolean isCosmonaut() {
        return false;
    }

    @Override
    public boolean isFan() {
        return true;
    }

    @Override
    public boolean isReporter() {
        return false;
    }

    @Override
    public boolean isPhotographer() {
        return false;
    }

    @Override
    public boolean isCameraman() {
        return false;
    }

    @Override
    public boolean isPolice() {
        return false;
    }

    @Override
    public Integer getActEnergy() {
        return 20;
    }
    @Override
    public String Act() {
        return "loudly shouts: \"JOE BIDENNN\"";
    }
}
