Resultado de ejecución de pruebas (mvn test)

Tests run: 4, Failures: 0, Errors: 0, Skipped: 0
BUILD SUCCESS
Total time: 4.191 s

Resumen de casos probados
Caso	Estado	Observación
CA-01 – Agregar producto	PASA	El carrito almacena el producto y actualiza total
CA-02 – Actualizar cantidad	PASA	Se recalcula el total correctamente
CA-03 – Eliminar producto	PASA	El carrito queda vacío
CA-05 – Eliminar producto inexistente	PASA	Se lanza excepción esperada

Reflexión del Equipo

Durante este laboratorio aprendimos que las pruebas de aceptación no verifican solamente fragmentos de código, sino funcionalidades completas desde el punto de vista del usuario.

También vimos la diferencia entre pruebas unitarias y de aceptación:
mientras las unitarias validan métodos, las de aceptación validan escenarios reales de uso.

Si estas funcionalidades fallaran en producción, el usuario no podría comprar, modificar cantidades ni vaciar el carrito, afectando directamente la experiencia de compra.

Checklist de cumplimiento

Proyecto Maven creado correctamente

Dependencia de JUnit configurada

Clases Product, CartItem y ShoppingCart implementadas

Historias de usuario elaboradas

Tabla de casos de prueba generada

Pruebas ejecutadas exitosamente (BUILD SUCCESS)

Evidencias documentadas