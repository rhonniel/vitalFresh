# vitalFresh

**Concepto de negocio**
El negocio vendera productos, inicialmente batidos, estos deben contar con la cantidad de calorias que poseen. Mas adelante se desea que los clientes puedan personalizar los batidos y poder visualizar las calorias que poseen.

Ingrediente

Los ingredientes son la materia prima del producto, (naranja,leche,queso parmesano o marihuana). Los ingredientes podran tener mas de un tipo de medida relacionada (ml,gr).

Calorias

Las calorias dependeran del ingrediente , el tipo de medida y la cantidad de esta (IngredientUnit). El numero de calorias es digitado de forma externa al crear el producto, el sistema no lo calculara en primera instancia pero podra calcular los totales de un plato.

Receta

Es la lista de pasos (stepRecipe) para la realizacion de un plato (Dish). Los pasos estan compuesto por los ingredientes , sus calorias y la cantidad con su medida.

Dish

El plato comprende una receta mas los detalles comerciales, el nombre con que se vende el precio ect. En este PR no se trabajo la parte comercial de venta por eso on hay nada relacionado a precios.

Diagrama UML
Entidades_producto drawio
