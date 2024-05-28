public class Names {
    private String firstName;
    private String middleName;
    private String lastName;
    public Names(String fullName){
        String[] names = fullName.split(" ");
        firstName = names[0];
        if(names.length == 3){
            middleName = names[1];
            lastName = names[2];
        }else if(names.length == 2){
            lastName = names[1];
        }
    }

    public String toString(){
        String toReturn = firstName;
        if (middleName == null) {
            toReturn = toReturn + " " + lastName;
        }else{
            toReturn = toReturn + " " + middleName + " " + lastName;
        }
        return toReturn;
    }
}
