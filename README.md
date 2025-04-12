# ProyectoCajeroAutomatico
Proyecto 1 de Base de Datos 2 (Cajero automático)

Este proyecto es una implementación de un sistema de cajero automático utilizando Java y MySQL y Oracle. Permite a los usuarios realizar operaciones bancarias como depósitos, retiros y transferencias de saldo entre cuentas.

🚀 Características
📌 Depósito de dinero en la cuenta del usuario.

📌 Retiro de efectivo con validación de saldo.

📌 Transferencias seguras entre cuentas.

📌 Manejo de transacciones con commit y rollback para evitar inconsistencias.

🛠️ Tecnologías utilizadas

Java

MySQL

Oracle

JDBC


# Integrantes
* 7691-18-26253 Ana Maria Montufar Aguirre
* 7690-21-1522 Jefferson Ramiro López Ramírez
* 7690-16-3882 Diego Fernando Velásquez Pichilla
* 7690-18-14490 MARLON ORLANDO RAMIREZ LUX
* 7690-17-6433 Victor Isaías Quino Quino


# Sript de BD usado
-- cliente

CREATE TABLE cliente (
    id_cliente VARCHAR(20) PRIMARY KEY,
    nombre_cliente VARCHAR(100),
    direccion VARCHAR(150),
    DPI VARCHAR(13),
    NIT VARCHAR (10),
    telefono VARCHAR(20),
    email VARCHAR(100),
    pin NUMBER(4)
);

-- cuenta

CREATE TABLE cuenta (
    id_cuenta VARCHAR(20) PRIMARY KEY,
    tipo_cuenta VARCHAR(20),
    saldo NUMERIC(12,2),
    id_cliente VARCHAR(20),
    FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente)
);

-- Tarjeta

CREATE TABLE tarjeta (
    id_tarjeta VARCHAR(20) PRIMARY KEY,
    numero_tarjeta VARCHAR(20),
    fecha_expiracion DATE,
    id_cliente VARCHAR(20),
    id_cuenta VARCHAR(20),
    FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente),
    FOREIGN KEY (id_cuenta) REFERENCES cuenta(id_cuenta)
);

-- cajero

CREATE TABLE cajero (
    codigo_atm VARCHAR(10) PRIMARY KEY,
    ubicacion VARCHAR(100),
    estado VARCHAR(20)
);

-- Transaccion 

CREATE TABLE transaccion (
    id_transaccion VARCHAR(20) PRIMARY KEY,
    tipo_transaccion VARCHAR(20),
    monto NUMERIC(12,2),
    fecha_transaccion DATE,
    hora_transaccion TIMESTAMP,
    estado_transaccion VARCHAR(20),
    codigo_atm VARCHAR(10),
    id_cuenta_origen VARCHAR(20),
    id_cuenta_destino VARCHAR(20),
    id_tarjeta VARCHAR(20),
    FOREIGN KEY (codigo_atm) REFERENCES cajero(codigo_atm),
    FOREIGN KEY (id_cuenta_origen) REFERENCES cuenta(id_cuenta),
    FOREIGN KEY (id_cuenta_destino) REFERENCES cuenta(id_cuenta),
    FOREIGN KEY (id_tarjeta) REFERENCES tarjeta(id_tarjeta)
);

-- Prestamo

CREATE TABLE prestamo (
    id_prestamo VARCHAR(20) PRIMARY KEY,
    monto NUMERIC(12,2),
    tasa_interes NUMERIC(5,2),
    numero_cuotas NUMBER(3),
    fecha_inicio DATE,
    fecha_vencimiento DATE,
    estado VARCHAR(20),
    id_cliente VARCHAR(20),
    FOREIGN KEY (id_cliente) REFERENCES cliente(id_cliente)
    
);

-- pago

CREATE TABLE pago (
    id_pago VARCHAR(20) PRIMARY KEY,
    monto_pago NUMERIC(12,2),
    fecha_pago DATE,
    id_prestamo VARCHAR(20),
    FOREIGN KEY (id_prestamo) REFERENCES prestamo(id_prestamo)
);

--INSERT EN TABLA CLIENTE
INSERT INTO cliente (id_cliente, nombre_cliente, direccion, DPI, NIT, telefono, email, pin)
VALUES ('C001', 'Ana Maria', 'Zona 10, Ciudad de Guatemala', '1234567890123', '1234567-8', '5555-1234', 'ana.maria@gmail.com', 1234);

INSERT INTO cliente (id_cliente, nombre_cliente, direccion, DPI, NIT, telefono, email, pin)
VALUES ('C002', 'Diego Fernando', 'Zona 11, Ciudad de Guatemala', '2345678901234', '2345678-9', '5555-5678', 'diego.fernando@gmail.com', 2345);

INSERT INTO cliente (id_cliente, nombre_cliente, direccion, DPI, NIT, telefono, email, pin)
VALUES ('C003', 'Victor Quino', 'Zona 12, Mixco', '3456789012345', '3456789-0', '5555-6789', 'victor.quino@gmail.com', 3456);

INSERT INTO cliente (id_cliente, nombre_cliente, direccion, DPI, NIT, telefono, email, pin)
VALUES ('C004', 'Jefferson Ramirez', 'Zona 1, Ciudad de Guatemala', '4567890123456', '4567890-1', '5555-9876', 'jefferson.ramirez@gmail.com', 4567);

INSERT INTO cliente (id_cliente, nombre_cliente, direccion, DPI, NIT, telefono, email, pin)
VALUES ('C005', 'Marlo Lux', 'Zona 5, Villa Nueva', '5678901234567', '5678901-2', '5555-4321', 'marlo.lux@gmail.com', 5678);



--INSERT EN TABLA CUENTA
INSERT INTO cuenta (id_cuenta, tipo_cuenta, saldo, id_cliente)
VALUES ('CU001', 'Ahorro', 2500.00, 'C001');

INSERT INTO cuenta (id_cuenta, tipo_cuenta, saldo, id_cliente)
VALUES ('CU002', 'Ahorro', 1800.00, 'C002');

INSERT INTO cuenta (id_cuenta, tipo_cuenta, saldo, id_cliente)
VALUES ('CU003', 'Ahorro', 3200.50, 'C003');

INSERT INTO cuenta (id_cuenta, tipo_cuenta, saldo, id_cliente)
VALUES ('CU004', 'Ahorro', 500.00, 'C004');

INSERT INTO cuenta (id_cuenta, tipo_cuenta, saldo, id_cliente)
VALUES ('CU005', 'Ahorro', 7500.75, 'C005');


--INSERT EN TABLA TARJETA
INSERT INTO tarjeta (id_tarjeta, numero_tarjeta, fecha_expiracion, id_cliente, id_cuenta)
VALUES ('T001', '4000123412341234', TO_DATE('2027-12-31', 'YYYY-MM-DD'), 'C001', 'CU001');

INSERT INTO tarjeta (id_tarjeta, numero_tarjeta, fecha_expiracion, id_cliente, id_cuenta)
VALUES ('T002', '4000567812345678', TO_DATE('2026-11-30', 'YYYY-MM-DD'), 'C002', 'CU002');

INSERT INTO tarjeta (id_tarjeta, numero_tarjeta, fecha_expiracion, id_cliente, id_cuenta)
VALUES ('T003', '4000987612349876', TO_DATE('2028-06-30', 'YYYY-MM-DD'), 'C003', 'CU003');

INSERT INTO tarjeta (id_tarjeta, numero_tarjeta, fecha_expiracion, id_cliente, id_cuenta)
VALUES ('T004', '4000654312346543', TO_DATE('2025-08-31', 'YYYY-MM-DD'), 'C004', 'CU004');

INSERT INTO tarjeta (id_tarjeta, numero_tarjeta, fecha_expiracion, id_cliente, id_cuenta)
VALUES ('T005', '4000111122223333', TO_DATE('2029-03-31', 'YYYY-MM-DD'), 'C005', 'CU005');


--INSERT EN TABLA CAJERO
INSERT INTO cajero (codigo_atm, ubicacion, estado)
VALUES ('ATM001', 'Zona 1, Ciudad de Guatemala', 'Activo');

INSERT INTO cajero (codigo_atm, ubicacion, estado)
VALUES ('ATM002', 'Centro Comercial Miraflores, Mixco', 'Activo');


COMMIT;



-- Crear la secuencia para los prestamos, comenzando desde 1
CREATE SEQUENCE secuencia_prestamos
START WITH 1 -- Comienza desde P001
INCREMENT BY 1; -- Incrementa de uno en uno


//Trigger correcto prestamos pagos
CREATE OR REPLACE TRIGGER prestamo_pagos
AFTER INSERT ON prestamo
FOR EACH ROW
DECLARE
    v_monto_pago NUMBER;
    v_fecha_pago DATE;
    v_cuota NUMBER;
BEGIN
    -- Calcular el monto total a pagar con intereses
    v_monto_pago := :NEW.monto + (:NEW.monto * :NEW.tasa_interes / 100);

    -- Calcular la cuota mensual
    v_cuota := ROUND(v_monto_pago / :NEW.numero_cuotas, 2);

    -- Generar los pagos mensuales
    FOR i IN 1..:NEW.numero_cuotas LOOP
        v_fecha_pago := ADD_MONTHS(:NEW.fecha_inicio, i - 1);

        INSERT INTO pago (id_pago, monto_pago, fecha_pago, id_prestamo)
        VALUES (
            'PAGO-' || :NEW.id_prestamo || '_' || i,
            v_cuota,
            v_fecha_pago,
            :NEW.id_prestamo
        );
    END LOOP;
END;
/



--Procedure
--Retiro de cuenta
CREATE OR REPLACE PROCEDURE sp_extraccion_caja_ahorro (
    p_id_cuenta      IN VARCHAR2,
    p_monto          IN NUMBER,
    p_mensaje        OUT VARCHAR2
)
IS
    v_saldo          cuenta.saldo%TYPE;
    v_tipo_cuenta    cuenta.tipo_cuenta%TYPE;
BEGIN
    -- Verificar cuenta
    SELECT saldo, tipo_cuenta INTO v_saldo, v_tipo_cuenta
    FROM cuenta
    WHERE id_cuenta = p_id_cuenta
    FOR UPDATE;

    -- Validar tipo de cuenta
    IF v_tipo_cuenta != 'Ahorro' THEN
        p_mensaje := '❌ La cuenta no es del tipo "Ahorro".';
        RETURN;
    END IF;

    -- Verificar saldo
    IF v_saldo < p_monto THEN
        p_mensaje := '❌ Fondos insuficientes.';
        RETURN;
    END IF;

    -- Realizar extracción
    UPDATE cuenta
    SET saldo = saldo - p_monto
    WHERE id_cuenta = p_id_cuenta;

    -- Registrar transacción
    INSERT INTO transaccion (
        id_transaccion, tipo_transaccion, monto, fecha_transaccion, hora_transaccion,
        estado_transaccion, id_cuenta_origen
    ) VALUES (
        'TXN_' || TO_CHAR(SYSDATE, 'YYYYMMDDHH24MISS'),
        'retiro', p_monto, SYSDATE, SYSTIMESTAMP,
        'exitosa', p_id_cuenta
    );

    -- Mensaje de éxito
    p_mensaje := '✅ Extracción realizada con éxito.';

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        p_mensaje := '❌ La cuenta no existe.';
    WHEN OTHERS THEN
        p_mensaje := '❌ Error inesperado: ' || SQLERRM;
END;



CREATE SEQUENCE seq_transaccion_id
    START WITH 1
    INCREMENT BY 1
    NOCACHE
    NOCYCLE;
    
    
    --Procedura transferencias
    CREATE OR REPLACE NONEDITIONABLE PROCEDURE sp_transferencia_entre_cajas (
    p_id_cuenta_origen    IN VARCHAR2,
    p_id_cuenta_destino   IN VARCHAR2,
    p_monto               IN NUMBER,
    p_mensaje             OUT VARCHAR2
)
IS
    v_saldo_origen      cuenta.saldo%TYPE;
    v_tipo_origen       cuenta.tipo_cuenta%TYPE;
    v_tipo_destino      cuenta.tipo_cuenta%TYPE;
    v_id_transaccion    VARCHAR2(30);
    v_id_tarjeta        tarjeta.id_tarjeta%TYPE;

    e_cuenta_invalida   EXCEPTION;
    e_saldo_insuficiente EXCEPTION;

    PRAGMA EXCEPTION_INIT(e_cuenta_invalida, -20001);
    PRAGMA EXCEPTION_INIT(e_saldo_insuficiente, -20002);
BEGIN
    SAVEPOINT inicio_transferencia;

    IF p_id_cuenta_origen = p_id_cuenta_destino THEN
        p_mensaje := '✗ Error: La cuenta origen y destino no pueden ser la misma';
        RETURN;
    END IF;

    IF p_monto <= 0 THEN
        p_mensaje := '✗ Error: El monto debe ser mayor que cero';
        RETURN;
    END IF;

    -- Validar cuenta origen
    BEGIN
        SELECT saldo, tipo_cuenta 
        INTO v_saldo_origen, v_tipo_origen
        FROM cuenta 
        WHERE id_cuenta = p_id_cuenta_origen
        FOR UPDATE;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            RAISE_APPLICATION_ERROR(-20001, 'Cuenta origen no existe');
        WHEN TOO_MANY_ROWS THEN
            RAISE_APPLICATION_ERROR(-20001, 'Múltiples cuentas origen encontradas');
    END;

    -- Validar cuenta destino
    BEGIN
        SELECT tipo_cuenta 
        INTO v_tipo_destino
        FROM cuenta 
        WHERE id_cuenta = p_id_cuenta_destino
        FOR UPDATE;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            RAISE_APPLICATION_ERROR(-20001, 'Cuenta destino no existe');
        WHEN TOO_MANY_ROWS THEN
            RAISE_APPLICATION_ERROR(-20001, 'Múltiples cuentas destino encontradas');
    END;

    -- Verificar saldo suficiente
    IF v_saldo_origen < p_monto THEN
        RAISE_APPLICATION_ERROR(-20002, 'Fondos insuficientes en cuenta origen');
    END IF;

    -- Obtener ID de tarjeta asociada a la cuenta origen (opcional)
    BEGIN
        SELECT id_tarjeta
        INTO v_id_tarjeta
        FROM tarjeta
        WHERE id_cuenta = p_id_cuenta_origen
        AND ROWNUM = 1;
    EXCEPTION
        WHEN NO_DATA_FOUND THEN
            v_id_tarjeta := NULL;
    END;

    -- Generar ID de transacción
    v_id_transaccion := 'TXN_' || TO_CHAR(seq_transaccion_id.NEXTVAL);

    -- Actualizar saldos
    UPDATE cuenta SET saldo = saldo - p_monto 
    WHERE id_cuenta = p_id_cuenta_origen;

    UPDATE cuenta SET saldo = saldo + p_monto 
    WHERE id_cuenta = p_id_cuenta_destino;

    -- Insertar transacción de débito
    INSERT INTO transaccion (
        id_transaccion, tipo_transaccion, monto, 
        fecha_transaccion, hora_transaccion,
        estado_transaccion, id_cuenta_origen, id_cuenta_destino, id_tarjeta
    ) VALUES (
        v_id_transaccion || '_DEB',
        'transferencia_salida', p_monto,
        SYSDATE, SYSTIMESTAMP,
        'exitosa', p_id_cuenta_origen, p_id_cuenta_destino, v_id_tarjeta
    );

    -- Insertar transacción de crédito
    INSERT INTO transaccion (
        id_transaccion, tipo_transaccion, monto, 
        fecha_transaccion, hora_transaccion,
        estado_transaccion, id_cuenta_origen, id_cuenta_destino, id_tarjeta
    ) VALUES (
        v_id_transaccion || '_CRE',
        'transferencia_entrada', p_monto,
        SYSDATE, SYSTIMESTAMP,
        'exitosa', p_id_cuenta_origen, p_id_cuenta_destino, v_id_tarjeta
    );

    -- Éxito
    p_mensaje := '✓ Transferencia exitosa';

EXCEPTION
    WHEN e_cuenta_invalida THEN
        ROLLBACK TO inicio_transferencia;
        p_mensaje := '✗ Error: ' || SQLERRM;
    WHEN e_saldo_insuficiente THEN
        ROLLBACK TO inicio_transferencia;
        p_mensaje := '✗ Error: ' || SQLERRM;
    WHEN OTHERS THEN
        ROLLBACK TO inicio_transferencia;
        p_mensaje := '✗ Error inesperado: ' || SQLERRM;
END;

COMMIT;

