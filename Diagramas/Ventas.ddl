-- Generado por Oracle SQL Developer Data Modeler 19.4.0.350.1424
--   en:        2020-03-05 18:13:16 CLST
--   sitio:      Oracle Database 11g
--   tipo:      Oracle Database 11g



DROP TABLE categoria CASCADE CONSTRAINTS;

DROP TABLE cliente CASCADE CONSTRAINTS;

DROP TABLE factura CASCADE CONSTRAINTS;

DROP TABLE producto CASCADE CONSTRAINTS;

DROP TABLE proveedor CASCADE CONSTRAINTS;

DROP TABLE telefono CASCADE CONSTRAINTS;

DROP TABLE venta CASCADE CONSTRAINTS;

CREATE TABLE categoria (
    id_categoria  NUMBER NOT NULL,
    nombre_cate   VARCHAR2(15),
    desc_cate     VARCHAR2(50)
);

ALTER TABLE categoria ADD CONSTRAINT categoria_pk PRIMARY KEY ( id_categoria );

CREATE TABLE cliente (
    rut_cliente  VARCHAR2(10) NOT NULL,
    nombre       VARCHAR2(30) NOT NULL,
    direccion    VARCHAR2(50) NOT NULL
);

ALTER TABLE cliente ADD CONSTRAINT cliente_pk PRIMARY KEY ( rut_cliente );

CREATE TABLE factura (
    num_fact    NUMBER NOT NULL,
    fecha_fact  DATE
);

ALTER TABLE factura ADD CONSTRAINT factura_pk PRIMARY KEY ( num_fact );

CREATE TABLE producto (
    id_prod             NUMBER NOT NULL,
    nombre_prod         VARCHAR2(40) NOT NULL,
    precio_actual_prod  NUMBER NOT NULL,
    stock_prod          NUMBER NOT NULL,
    nombre_prov         VARCHAR2(40) NOT NULL,
    id_categoria        NUMBER NOT NULL
);

ALTER TABLE producto ADD CONSTRAINT producto_pk PRIMARY KEY ( id_prod );

CREATE TABLE proveedor (
    rut_proveedor   VARCHAR2(10) NOT NULL,
    direccion_prov  VARCHAR2(50) NOT NULL,
    telefono_prov   VARCHAR2(10) NOT NULL,
    web_prov        VARCHAR2(30),
    nombre_prov     VARCHAR2(40) NOT NULL
);

ALTER TABLE proveedor ADD CONSTRAINT proveedor_pk PRIMARY KEY ( rut_proveedor );

CREATE TABLE telefono (
    rut_cliente  VARCHAR2(10) NOT NULL,
    numero       VARCHAR2(10) NOT NULL,
    id_telefono  INTEGER NOT NULL
);

ALTER TABLE telefono ADD CONSTRAINT telefono_pk PRIMARY KEY ( id_telefono );

CREATE TABLE venta (
    id_venta          NUMBER NOT NULL,
    fecha_vta         DATE,
    rut_cliente       VARCHAR2(10) NOT NULL,
    descuento         NUMBER,
    monto_final       NUMBER,
    num_fact          NUMBER NOT NULL,
    id_prod           NUMBER NOT NULL,
    cant_prod         NUMBER,
    monto_total_prod  NUMBER
);

ALTER TABLE venta ADD CONSTRAINT venta_pk PRIMARY KEY ( id_venta );

ALTER TABLE venta
    ADD CONSTRAINT cliente_fk FOREIGN KEY ( rut_cliente )
        REFERENCES cliente ( rut_cliente );

ALTER TABLE producto
    ADD CONSTRAINT producto_categoria_fk FOREIGN KEY ( id_categoria )
        REFERENCES categoria ( id_categoria );

ALTER TABLE producto
    ADD CONSTRAINT producto_proveedor_fk FOREIGN KEY ( nombre_prov )
        REFERENCES proveedor ( rut_proveedor );

ALTER TABLE telefono
    ADD CONSTRAINT telefono_cliente_fk FOREIGN KEY ( rut_cliente )
        REFERENCES cliente ( rut_cliente );

ALTER TABLE venta
    ADD CONSTRAINT venta_factura_fk FOREIGN KEY ( num_fact )
        REFERENCES factura ( num_fact );

ALTER TABLE venta
    ADD CONSTRAINT venta_producto_fk FOREIGN KEY ( id_prod )
        REFERENCES producto ( id_prod );

CREATE SEQUENCE cate_id_categoria_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER cate_id_categoria_trg BEFORE
    INSERT ON categoria
    FOR EACH ROW
    WHEN ( new.id_categoria IS NULL )
BEGIN
    :new.id_categoria := cate_id_categoria_seq.nextval;
END;
/

CREATE SEQUENCE prod_id_prod_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER prod_id_prod_trg BEFORE
    INSERT ON producto
    FOR EACH ROW
    WHEN ( new.id_prod IS NULL )
BEGIN
    :new.id_prod := prod_id_prod_seq.nextval;
END;
/

CREATE SEQUENCE vent_id_venta_seq START WITH 1 NOCACHE ORDER;

CREATE OR REPLACE TRIGGER vent_id_venta_trg BEFORE
    INSERT ON venta
    FOR EACH ROW
    WHEN ( new.id_venta IS NULL )
BEGIN
    :new.id_venta := vent_id_venta_seq.nextval;
END;
/



-- Informe de Resumen de Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                             7
-- CREATE INDEX                             0
-- ALTER TABLE                             13
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           3
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          3
-- CREATE MATERIALIZED VIEW                 0
-- CREATE MATERIALIZED VIEW LOG             0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0
