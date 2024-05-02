package com.example.t1_grupo05

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Toast.makeText(this, "create", Toast.LENGTH_SHORT).show()

        Toast.makeText(this, "Activity created", Toast.LENGTH_SHORT).show()

        val textView13 = findViewById<TextView>(R.id.textView13)
        val textView13b = findViewById<TextView>(R.id.textView13b)
        val textView13c = findViewById<TextView>(R.id.textView13c)
        val textView13d = findViewById<TextView>(R.id.textView13d)
        val textView13e = findViewById<TextView>(R.id.textView13e)
        val textView13f = findViewById<TextView>(R.id.textView13f)
        val textView13g = findViewById<TextView>(R.id.textView13g)
        val textView13h = findViewById<TextView>(R.id.textView13h)
        // Selecciona un índice aleatorio dentro del rango de la lista de transacciones
        var randomIndex = Random.nextInt(transacciones.size)

        // Asigna el texto de la transacción aleatoria al textView13
        textView13.text = transacciones[randomIndex]
        randomIndex = Random.nextInt(transacciones.size)
        textView13b.text = transacciones[randomIndex]
        randomIndex = Random.nextInt(transacciones.size)
        textView13c.text = transacciones[randomIndex]

        randomIndex = Random.nextInt(transacciones.size)
        textView13d.text = transacciones[randomIndex]


        randomIndex = Random.nextInt(transacciones.size)
        textView13e.text = transacciones[randomIndex]


        randomIndex = Random.nextInt(transacciones.size)
        textView13f.text = transacciones[randomIndex]

        randomIndex = Random.nextInt(transacciones.size)
        textView13g.text = transacciones[randomIndex]

        randomIndex = Random.nextInt(transacciones.size)
        textView13h.text = transacciones[randomIndex]


        val textView15 = findViewById<TextView>(R.id.textView13)
        val textView15b = findViewById<TextView>(R.id.textView15b)
        val textView15c = findViewById<TextView>(R.id.textView15c)
        val textView15d = findViewById<TextView>(R.id.textView15d)
        val textView15e = findViewById<TextView>(R.id.textView15e)
        val textView15f = findViewById<TextView>(R.id.textView15f)
        val textView15g = findViewById<TextView>(R.id.textView15g)
        val textView15h = findViewById<TextView>(R.id.textView15h)
        // Selecciona un índice aleatorio dentro del rango de la lista de transacciones
         randomIndex = Random.nextInt(Pagos.size)

        // Asigna el texto de la transacción aleatoria al textView13
        textView15.text = Pagos[randomIndex]
        randomIndex = Random.nextInt(Pagos.size)
        textView15b.text = Pagos[randomIndex]
        randomIndex = Random.nextInt(Pagos.size)
        textView15c.text = Pagos[randomIndex]

        randomIndex = Random.nextInt(Pagos.size)
        textView15d.text = Pagos[randomIndex]

        textView15e.text = Pagos[randomIndex]
        randomIndex = Random.nextInt(Pagos.size)
        textView15f.text = Pagos[randomIndex]
        randomIndex = Random.nextInt(Pagos.size)
        textView15g.text = Pagos[randomIndex]

        randomIndex = Random.nextInt(Pagos.size)
        textView15h.text = Pagos[randomIndex]


        // Muestra un Toast con el texto asignado al textView13
        Toast.makeText(this, "Text assigned to textView13: ${textView13.text}", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        // Muestra un Toast cuando la actividad comienza
        Toast.makeText(this, "Activity started", Toast.LENGTH_SHORT).show()
        // La actividad está a punto de hacerse visible.
    }

    private val transacciones = listOf(
        "YAPEO A 9529698889",
        "TRANSACCION COD 1938248324",
        "2132141241",
        "COD 192391388",
        "PAGO EFECTIVO",
        "TRANSFERENCIA A 1234567890",
        "COMPRA CON TARJETA DE CRÉDITO",
        "PAGO CON PAYPAL",
        "ENVÍO POR ZELLE",
        "DEPÓSITO BANCARIO",
        "PAGO CON BITCOIN",
        "PAGO CON ETHEREUM",
        "INTERCAMBIO DE MONEDAS",
        "PAGO CON VALES DE DESPENSA",
        "PAGO CON CHEQUE",
        "REEMBOLSO POR DEVOLUCIÓN",
        "DONACIÓN A ORGANIZACIÓN BENÉFICA",
        "PAGO DE SERVICIOS",
        "COMPRA DE BOLETOS DE AVIÓN",
        "RECIBO DE SUELDO"
    )

    private val Pagos = listOf(
        "$2",
        "$5",
        "$10",
        "$15",
        "$20",
        "$25",
        "$30",
        "$35",
        "$40",
        "$45",
        "$50",
        "$55",
        "$60",
        "$65",
        "$70",
        "$75",
        "$80",
        "$85",
        "$90",
        "$100"
    )

}