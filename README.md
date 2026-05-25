<p align="center">
  <img src="https://images.unsplash.com/photo-1556228578-8c89e6adf883?w=400" alt="Orders - WZZY">
</p>

## PERSONAL PROJECT - MS-ORDER 🛒

### 📖 Description
Microservice responsible for **orchestrating orders and shopping carts** of the library. MS-Order is responsible for:
- 🛒 **Manage shopping carts** of customers
- 📦 **Create and process orders** with item validation
- 📋 **Manage order items** with quantities and prices
- 💳 **Orchestrate checkout** integrating with payment and inventory
- 📊 **Maintain order history** of customers
- 🔍 **Search orders** by ID, customer, or date
- ⚖️ **Validate availability** of items with ms-stock
- 💰 **Calculate totals** with discounts and taxes

This service is part of a microservices architecture composed of:

- [`bff-wzzy-library`](https://github.com/codewesleylima/bff-wzzy-library) – Central gateway and orchestration
- [`ms-wzzy-auth`](https://github.com/codewesleylima/ms-wzzy-auth) – Authentication and JWT token management
- [`ms-wzzy-catalog`](https://github.com/codewesleylima/ms-wzzy-catalog) – Book catalog, authors, publishers, and categories
- [`ms-wzzy-customers`](https://github.com/codewesleylima/ms-wzzy-customers) – Customer profile, address, and preference management
- [`ms-wzzy-order`](https://github.com/codewesleylima/ms-wzzy-order) – Shopping cart and order orchestration
- [`ms-wzzy-payments`](https://github.com/codewesleylima/ms-wzzy-payments) – Payment processing and gateway integration
- [`ms-wzzy-stock`](https://github.com/codewesleylima/ms-wzzy-stock) – Inventory and availability management

---

## 🔁 Order and Shopping Cart Flow

**Shopping Cart Flow:**

1. **Client** → BFF: Adds book to cart
2. BFF → **ms-order**: Creates/updates cart
3. **ms-order** → **ms-catalog**: Validates book and price
4. **ms-catalog** → **ms-order**: Returns book data
5. **ms-order** → Database: Persists item in cart
6. **ms-order** → BFF: Confirms item added
7. BFF → **Client**: Displays updated cart

**Checkout and Order Flow:**

1. **Client** → BFF: Initiates checkout
2. BFF → **ms-order**: Creates order from cart
3. **ms-order** → **ms-stock**: Validates item availability
4. **ms-stock** → **ms-order**: Confirms availability
5. BFF → **ms-payments**: Processes payment
6. **ms-payments** → BFF: Confirms payment
7. **ms-order** → **ms-stock**: Reserves items
8. **ms-order** → **ms-customers**: Records order in history
9. **ms-order** → Database: Persists order
10. **ms-order** → BFF: Returns order confirmation
11. BFF → **Client**: Displays confirmation with order number

---

### ⚡ Features

1. 🛒 Manage customer shopping carts
2. 🎯 Add, remove, and update cart items
3. 📦 Create orders from shopping cart
4. 📋 Manage order items with fixed prices
5. 💳 Orchestrate complete checkout flow
6. ⚖️ Validate item availability with ms-stock
7. 💰 Calculate subtotal, taxes, and total
8. 🔍 Search orders by customer, date, or status
9. 📊 Maintain order history
10. 🔄 Manage order status (pending, confirmed, shipped, delivered)

---

### 🖥️ **Running Locally**

To run the project locally:

```sh
./gradlew bootRun
```

> 💡 Make sure PostgreSQL database is running and that ms-stock and ms-payments microservices are active.

---

#### 🛠️ Technologies Used

- ☕ Java 21
- 🍃 Spring Boot 3
- 🌐 Spring Cloud OpenFeign (integration with other services)
- 📦 Spring Data JPA
- 🗄️ PostgreSQL
- 🧪 JUnit / Mockito
- 🔧 Gradle

---

### 🛺 Author

<table>
  <tr>
    <td align="center">
      <a href="https://www.linkedin.com/in/wesslima/" title="Wesley Lima">
        <img src="https://media.licdn.com/dms/image/v2/D4D03AQEVAsL2UL6A0w/profile-displayphoto-shrink_400_400/profile-displayphoto-shrink_400_400/0/1721323972268?e=1746662400&v=beta&t=4_2RDPgz5FqJ2G-yRQk3y0vWMVRpSeAPKMAO7IOFXeE" width="100px;" alt="Wesley Lima Photo"/><br>
        <sub>
          <b>Wesley Lima</b>
        </sub>
      </a>
    </td>
  </tr>
</table>
