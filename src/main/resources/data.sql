INSERT INTO MARCAS (MARCA, PAIS) VALUES ('AUDI', 'Alemania');
INSERT INTO MARCAS (MARCA, PAIS) VALUES ('BMW', 'Alemania');
INSERT INTO MARCAS (MARCA, PAIS) VALUES ('MERCEDES-BENZ', 'Alemania');
INSERT INTO MARCAS (MARCA, PAIS) VALUES ('TOYOTA', 'Japon');
INSERT INTO MARCAS (MARCA, PAIS) VALUES ('HONDA', 'Japon');
INSERT INTO MARCAS (MARCA, PAIS) VALUES ('FORD', 'Estados Unidos');
INSERT INTO MARCAS (MARCA, PAIS) VALUES ('CHEVROLET', 'Estados Unidos');
INSERT INTO MARCAS (MARCA, PAIS) VALUES ('VOLKSWAGEN', 'Alemania');
INSERT INTO MARCAS (MARCA, PAIS) VALUES ('NISSAN', 'Japon');
INSERT INTO MARCAS (MARCA, PAIS) VALUES ('MAZDA', 'Japon');

INSERT INTO AUTOS (ID, MARCA, MODELO, LANZAMIENTO, CILINDRAJE) VALUES (1, 'AUDI', 'A4', 2022, 2000);
INSERT INTO AUTOS (ID, MARCA, MODELO, LANZAMIENTO, CILINDRAJE) VALUES (2, 'BMW', 'Serie 3', 2023, 2500);
INSERT INTO AUTOS (ID, MARCA, MODELO, LANZAMIENTO, CILINDRAJE) VALUES (3, 'MERCEDES-BENZ', 'Clase C', 2022, 1800);
INSERT INTO AUTOS (ID, MARCA, MODELO, LANZAMIENTO, CILINDRAJE) VALUES (4, 'TOYOTA', 'Corolla', 2024, 1600);
INSERT INTO AUTOS (ID, MARCA, MODELO, LANZAMIENTO, CILINDRAJE) VALUES (5, 'HONDA', 'Civic', 2023, 1800);
INSERT INTO AUTOS (ID, MARCA, MODELO, LANZAMIENTO, CILINDRAJE) VALUES (6, 'FORD', 'Mustang', 2022, 5000);
INSERT INTO AUTOS (ID, MARCA, MODELO, LANZAMIENTO, CILINDRAJE) VALUES (7, 'CHEVROLET', 'Sail', 2023, 3600);
INSERT INTO AUTOS (ID, MARCA, MODELO, LANZAMIENTO, CILINDRAJE) VALUES (8, 'VOLKSWAGEN', 'Golf', 2024, 2000);
INSERT INTO AUTOS (ID, MARCA, MODELO, LANZAMIENTO, CILINDRAJE) VALUES (9, 'NISSAN', 'Versa', 2022, 2500);
INSERT INTO AUTOS (ID, MARCA, MODELO, LANZAMIENTO, CILINDRAJE) VALUES (10, 'MAZDA', 'Mazda3', 2023, 2200);

INSERT INTO CLIENTES (CEDULA, NOMBRE, TELEFONO, CORREOELECTRONICO) VALUES (123, 'Carlos Perez', 3101234567, 'carlos.perez@gmail.com');
INSERT INTO CLIENTES (CEDULA, NOMBRE, TELEFONO, CORREOELECTRONICO) VALUES (124, 'Luisa Martinez', 3102345678, 'luisa.martinez@gmail.com');
INSERT INTO CLIENTES (CEDULA, NOMBRE, TELEFONO, CORREOELECTRONICO) VALUES (125, 'Juan Garcia', 3103456789, 'juan.garcia@gmail.com');
INSERT INTO CLIENTES (CEDULA, NOMBRE, TELEFONO, CORREOELECTRONICO) VALUES (126, 'Ana Lopez', 3104567890, 'ana.lopez@gmail.com');
INSERT INTO CLIENTES (CEDULA, NOMBRE, TELEFONO, CORREOELECTRONICO) VALUES (127, 'Maria Rodriguez', 3105678901, 'maria.rodriguez@gmail.com');
INSERT INTO CLIENTES (CEDULA, NOMBRE, TELEFONO, CORREOELECTRONICO) VALUES (128, 'Pedro Gomez', 3106789012, 'pedro.gomez@gmail.com');
INSERT INTO CLIENTES (CEDULA, NOMBRE, TELEFONO, CORREOELECTRONICO) VALUES (129, 'Laura Gonzalez', 3107890123, 'laura.gonzalez@gmail.com');
INSERT INTO CLIENTES (CEDULA, NOMBRE, TELEFONO, CORREOELECTRONICO) VALUES (130, 'Andres Sanchez', 3108901234, 'andres.sanchez@gmail.com');
INSERT INTO CLIENTES (CEDULA, NOMBRE, TELEFONO, CORREOELECTRONICO) VALUES (131, 'Paola Ramirez', 3109012345, 'paola.ramirez@gmail.com');
INSERT INTO CLIENTES (CEDULA, NOMBRE, TELEFONO, CORREOELECTRONICO) VALUES (132, 'Camilo Herrera', 3100123456, 'camilo.herrera@gmail.com');
INSERT INTO CLIENTES (CEDULA, NOMBRE, TELEFONO, CORREOELECTRONICO) VALUES (133, 'Diana Castro', 3101234567, 'diana.castro@gmail.com');
INSERT INTO CLIENTES (CEDULA, NOMBRE, TELEFONO, CORREOELECTRONICO) VALUES (134, 'Santiago Vargas', 3102345678, 'santiago.vargas@gmail.com');
INSERT INTO CLIENTES (CEDULA, NOMBRE, TELEFONO, CORREOELECTRONICO) VALUES (135, 'Valentina Medina', 3103456789, 'valentina.medina@gmail.com');
INSERT INTO CLIENTES (CEDULA, NOMBRE, TELEFONO, CORREOELECTRONICO) VALUES (136, 'Jorge Torres', 3104567890, 'jorge.torres@gmail.com');

-- INSERT INTO COTIZACIONES (NUMCOTIZACION, CEDULA, DESCRIPCION) VALUES (1, 123, 'ALINEACION Y BALANCEO');
-- INSERT INTO COTIZACIONES (NUMCOTIZACION, CEDULA, DESCRIPCION) VALUES (2, 124, 'CAMBIO DE KIT DE EMBRAGUE');
-- INSERT INTO COTIZACIONES (NUMCOTIZACION, CEDULA, DESCRIPCION) VALUES (3, 125, 'CAMBIO DE CORREA DE REPARTICION');
-- INSERT INTO COTIZACIONES (NUMCOTIZACION, CEDULA, DESCRIPCION) VALUES (4, 126, 'CAMBIO DE AMORTIGUADORES');
-- INSERT INTO COTIZACIONES (NUMCOTIZACION, CEDULA, DESCRIPCION) VALUES (5, 127, 'REPARACION DE MOTOR');
-- INSERT INTO COTIZACIONES (NUMCOTIZACION, CEDULA, DESCRIPCION) VALUES (6, 128, 'CAMBIOS DE ACEITE Y FILTROS');
-- INSERT INTO COTIZACIONES (NUMCOTIZACION, CEDULA, DESCRIPCION) VALUES (7, 129, 'REVISION DE AMORTIGUADORES');
-- INSERT INTO COTIZACIONES (NUMCOTIZACION, CEDULA, DESCRIPCION) VALUES (8, 130, 'REVISION DE LIQUIDOS');
-- INSERT INTO COTIZACIONES (NUMCOTIZACION, CEDULA, DESCRIPCION) VALUES (9, 131, 'REVISION BATERIA');
-- INSERT INTO COTIZACIONES (NUMCOTIZACION, CEDULA, DESCRIPCION) VALUES (10, 132, 'BOMBAS Y MANGUERAS');
-- INSERT INTO COTIZACIONES (NUMCOTIZACION, CEDULA, DESCRIPCION) VALUES (11, 133, 'LIQUIDO DE FRENOS');
-- INSERT INTO COTIZACIONES (NUMCOTIZACION, CEDULA, DESCRIPCION) VALUES (12, 134, 'SCANNER');
-- INSERT INTO COTIZACIONES (NUMCOTIZACION, CEDULA, DESCRIPCION) VALUES (13, 135, 'CAMBIO DE REPUESTOS');
-- INSERT INTO COTIZACIONES (NUMCOTIZACION, CEDULA, DESCRIPCION) VALUES (14, 136, 'SINCRONIZACION');
INSERT INTO COTIZACIONES (NUMCOTIZACION, CEDULA, ESTADO, SUBTOTAL, TOTAL) VALUES (2, '124', 'Creado', 895432, 1123045);
INSERT INTO COTIZACIONES (NUMCOTIZACION, CEDULA, ESTADO, SUBTOTAL, TOTAL) VALUES (3, '125', 'Creado', 1576432, 1894320);
INSERT INTO COTIZACIONES (NUMCOTIZACION, CEDULA, ESTADO, SUBTOTAL, TOTAL) VALUES (4, '126', 'Creado', 345670, 412345);
INSERT INTO COTIZACIONES (NUMCOTIZACION, CEDULA, ESTADO, SUBTOTAL, TOTAL) VALUES (5, '127', 'Creado', 1345678, 1600000);
INSERT INTO COTIZACIONES (NUMCOTIZACION, CEDULA, ESTADO, SUBTOTAL, TOTAL) VALUES (6, '128', 'Creado', 567890, 670123);
INSERT INTO COTIZACIONES (NUMCOTIZACION, CEDULA, ESTADO, SUBTOTAL, TOTAL) VALUES (7, '129', 'Creado', 1098765, 1320987);
INSERT INTO COTIZACIONES (NUMCOTIZACION, CEDULA, ESTADO, SUBTOTAL, TOTAL) VALUES (8, '130', 'Creado', 780123, 945678);
INSERT INTO COTIZACIONES (NUMCOTIZACION, CEDULA, ESTADO, SUBTOTAL, TOTAL) VALUES (9, '131', 'Creado', 123456, 150987);
INSERT INTO COTIZACIONES (NUMCOTIZACION, CEDULA, ESTADO, SUBTOTAL, TOTAL) VALUES (10, '132', 'Creado', 1456789, 1765432);
INSERT INTO COTIZACIONES (NUMCOTIZACION, CEDULA, ESTADO, SUBTOTAL, TOTAL) VALUES (11, '133', 'Creado', 234567, 290123);
INSERT INTO COTIZACIONES (NUMCOTIZACION, CEDULA, ESTADO, SUBTOTAL, TOTAL) VALUES (12, '134', 'Creado', 890123, 1100123);
INSERT INTO COTIZACIONES (NUMCOTIZACION, CEDULA, ESTADO, SUBTOTAL, TOTAL) VALUES (13, '135', 'Creado', 456789, 567890);
INSERT INTO COTIZACIONES (NUMCOTIZACION, CEDULA, ESTADO, SUBTOTAL, TOTAL) VALUES (14, '136', 'Creado', 1678901, 2000000);
INSERT INTO COTIZACIONES (NUMCOTIZACION, CEDULA, ESTADO, SUBTOTAL, TOTAL) VALUES (15, '123', 'Creado', 987654, 1200987);

INSERT INTO PRODUCTOS (PRODUCTO, MARCA, TIPO, PRECIO) VALUES ('ALINEACION Y BALANCEO', 'BMW', 'SERVICIO', 95000);
INSERT INTO PRODUCTOS (PRODUCTO, MARCA, TIPO, PRECIO) VALUES ('CAMBIO DE KIT DE EMBRAGUE', 'MERCEDES-BENZ', 'SERVICIO', 250000);
INSERT INTO PRODUCTOS (PRODUCTO, MARCA, TIPO, PRECIO) VALUES ('CAMBIO DE CORREA DE REPARTICION', 'TOYOTA', 'SERVICIO', 300000);
INSERT INTO PRODUCTOS (PRODUCTO, MARCA, TIPO, PRECIO) VALUES ('CAMBIO DE AMORTIGUADORES', 'HONDA', 'SERVICIO', 1430000);
INSERT INTO PRODUCTOS (PRODUCTO, MARCA, TIPO, PRECIO) VALUES ('REPARACION DE MOTOR', 'FORD', 'SERVICIO', 2500000);
INSERT INTO PRODUCTOS (PRODUCTO, MARCA, TIPO, PRECIO) VALUES ('CAMBIOS DE ACEITE Y FILTROS', 'CHEVROLET', 'SERVICIO', 140000);
INSERT INTO PRODUCTOS (PRODUCTO, MARCA, TIPO, PRECIO) VALUES ('REVISION DE AMORTIGUADORES', 'VOLKSWAGEN', 'SERVICIO', 80000);
INSERT INTO PRODUCTOS (PRODUCTO, MARCA, TIPO, PRECIO) VALUES ('REVISION DE LIQUIDOS', 'NISSAN', 'SERVICIO', 60000);
INSERT INTO PRODUCTOS (PRODUCTO, MARCA, TIPO, PRECIO) VALUES ('REVISION BATERIA', 'MAZDA', 'SERVICIO', 70000);
INSERT INTO PRODUCTOS (PRODUCTO, MARCA, TIPO, PRECIO) VALUES ('BOMBAS Y MANGUERAS', 'AUDI', 'SERVICIO', 500000);
INSERT INTO PRODUCTOS (PRODUCTO, MARCA, TIPO, PRECIO) VALUES ('LIQUIDO DE FRENOS', 'BMW', 'SERVICIO', 350000);
INSERT INTO PRODUCTOS (PRODUCTO, MARCA, TIPO, PRECIO) VALUES ('SCANNER', 'MERCEDES-BENZ', 'SERVICIO', 60000);
INSERT INTO PRODUCTOS (PRODUCTO, MARCA, TIPO, PRECIO) VALUES ('CAMBIO DE REPUESTOS', 'TOYOTA', 'SERVICIO', 150000);
INSERT INTO PRODUCTOS (PRODUCTO, MARCA, TIPO, PRECIO) VALUES ('SINCRONIZACION', 'HONDA', 'SERVICIO', 500000);




