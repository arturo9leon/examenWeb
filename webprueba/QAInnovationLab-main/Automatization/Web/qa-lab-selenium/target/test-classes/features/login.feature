#language: es
@testfeature
Característica: Login
  Yo, como usuario
  Quiero, tener una opción para iniciar sesión
  Para ver todos los items

  @test
  Escenario: Iniciar sesión
    Dado que me encuentro en la página de login de Platanito
    Cuando inicio sesión con las credenciales usuario: "arturo9leon@gmail.com" y contraseña: "Mblaq966059618"
    #Entonces valido que debería aparecer el título de "Products"
    Y al ingresar hago clic en ofertas
    Y seleccione un producto
    Y seleciona un item
    Y agregar el producto al carrito
    #Y también valido que al menos exista un item