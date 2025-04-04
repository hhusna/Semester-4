/* Nama  : Miftahul Husna
 * NIM   : 222313208
 * Kelas : 2KS1
 PEMROGRAMAN BERORIENTASI OBJEK
 PERTEMUAN 3 - TUGAS 1
 */


import java.time.LocalDate;

public class Visit {
    private Customer customer;
    private LocalDate date;
    private double serviceExpense;  //biaya layanan
    private double productExpense;  //biaya produk

    /*public Visit(String name, LocalDate date) {
        this.customer = new Customer(name);
        this.date = date;
    }*/

    public Visit(Customer customer, LocalDate date) {
        this.customer = customer;
        this.date = date;
    }

    public String getName() {
        return customer.getName();
    }

    //mendapatkan biaya layanan
    public double getServiceExpense() {
        return serviceExpense;
    }
    //mengeset biaya layanan
    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense = serviceExpense;
    }
    //get biaya produk
    public double getProductExpense() {
        return productExpense;
    }
    //get biaya layanan
    public void setProductExpense(double productExpense) {
        this.productExpense = productExpense;
    }

    public double getTotalExpense() {
        return serviceExpense + productExpense;
    }

    public double getTotalExpenseAfterDiscount() {
        return ((getServiceExpense() * (1 - DiscountRate.getServiceDiscountRate(customer.getMemberType())))
                + (getProductExpense() * (1 - DiscountRate.getProductDiscountRate(customer.getMemberType()))));
    }

    public String toString() {
        String text = String.format("Customer[%s, date = %s, serviceExpense = %.1f",
                        customer.getName(), date, serviceExpense);

                if (customer.isMember()) {
                    text += String.format(", serviceDiscount = %.0f%%",
                                        DiscountRate.getServiceDiscountRate(customer.getMemberType()) * 100);
                }

                text += String.format(", productExpense = %.1f", productExpense);
                if (customer.isMember()) {
                    text += String.format(", productDiscount = %.1f%%",
                                    DiscountRate.getProductDiscountRate(customer.getMemberType()) * 100);
                }

                text += String.format(", totalExpense = %.2f", getTotalExpense());
                if (customer.isMember()) {
                    text += String.format(", totalExpenseAfterDiscount = %.2f", getTotalExpenseAfterDiscount());
                }

                text += "]";
        return text;
    }
}
