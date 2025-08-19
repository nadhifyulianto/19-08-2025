
    public class AccountTest {
    public static void main(String[] args) {
        SavingAccount account1 = new SavingAccount();
        account1.nama = "Nadhif";
        account1.saldo = 99000.0;
        account1.bunga = 0.02;
        account1.cetak();

        SavingAccount account2 = new SavingAccount();
        account2.nama = "Ytta";
        account2.saldo = 8000.0;
        account2.cetak();
    }
}
