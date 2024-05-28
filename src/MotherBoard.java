public class MotherBoard {

    private SataDrive[] sataDrives = new SataDrive[4];

    public void showSataDrives() {
        for(SataDrive sataDrive : sataDrives){
            System.out.println(sataDrive);
        }
    }

    public void addSataDrive(SataDrive sataDrive){
        boolean isAdded = false;
        for(int i = 0; i < sataDrives.length; i++){
            if(sataDrives[i] == null){
                sataDrives[i] = sataDrive;
                isAdded = true;
                break;
            }
        }
        if(!isAdded){
            System.out.println("Mother board is full");
        }
    }
}
