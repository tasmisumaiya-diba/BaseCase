public class Order
{
        public String name;
        private double price;
        private int quantity;
        Order(String name, double price, int quantity)throws Exception {
            this.name = name;
            this.price = price;
            this.quantity = quantity;
            if (price <= 0)
                throw new Exception("price can't be 0 or negative");
            this.price = price;
            if (quantity <= 0)
                throw new Exception("quantity can't be 0 or negative");
            this.quantity = quantity;
        }
            public void setPrice ( double price)
            {
                this.price = price;
            }
            public void setQuantity ( int quantity) throws Exception
            {
                this.quantity = quantity;
            }
        public double total()
        {
           double Total = (price*quantity);
            return Total;
        }
        @Override
        public String toString()
        {
           return name + " - " +  quantity+" pcs x " +price + " = " + total();
        }
    }
