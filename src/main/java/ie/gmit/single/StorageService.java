package ie.gmit.single;

public class StorageService
{
    private Store store = new Store();

    public void saveData(User user) {
        store.store(user);
    }
}
