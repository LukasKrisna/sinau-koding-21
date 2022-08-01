CREATE DATABASE toko_db;
CREATE TABLE supplier(
    id_supplier INT PRIMARY KEY,
    nama_supplier VARCHAR(100) NOT NULL,
    no_telp VARCHAR(20) NOT NULL,
    alamat VARCHAR(255)
);
CREATE TABLE pembeli(
    id_pembeli INT PRIMARY KEY,
    nama_pembeli VARCHAR(100) NOT NULL,
    no_telp VARCHAR(20) NOT NULL,
    alamat VARCHAR(255)
);
CREATE TABLE pembayaran(
    id_pembayaran INT PRIMARY KEY,
    tgl_bayar DATETIME NOT NULL,
    total DOUBLE NOT NULL,
    id_transaksi INT
);
CREATE TABLE barang(
    id_barang INT PRIMARY KEY,
    nama_barang VARCHAR(100) NOT NULL,
    harga DOUBLE(30, 0) NOT NULL,
    stok INT,
    id_supplier INT
);
CREATE TABLE transaksi(
    id_transaksi INT PRIMARY KEY,
    id_barang INT,
    id_pembeli INT,
    FOREIGN KEY (id_barang) REFERENCES barang(id_barang),
    FOREIGN KEY (id_pembeli) REFERENCES pembeli(id_pembeli),
    tgl_transaksi DATETIME,
    keterangan VARCHAR(255)
);
ALTER TABLE barang
ADD FOREIGN KEY (id_supplier) REFERENCES supplier(id_supplier);