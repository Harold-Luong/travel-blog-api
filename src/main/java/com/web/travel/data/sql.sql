-- Tạo bảng User
CREATE TABLE User (
  id INT PRIMARY KEY,
  username VARCHAR(50) NOT NULL UNIQUE,
  password VARCHAR(255) NOT NULL,
  full_name VARCHAR(255),
  email VARCHAR(255) UNIQUE,
  phone VARCHAR(20)
);

-- Tạo bảng Article
CREATE TABLE Article (
  id INT PRIMARY KEY,
  title VARCHAR(255) NOT NULL,
  content TEXT,
  author_id INT NOT NULL,
  category_id INT NOT NULL,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  FOREIGN KEY (author_id) REFERENCES User(id),
  FOREIGN KEY (category_id) REFERENCES Category(id)
);

-- Tạo bảng Category
CREATE TABLE Category (
  id INT PRIMARY KEY,
  name VARCHAR(50) NOT NULL UNIQUE,
  description TEXT
);

-- Tạo bảng Comment
CREATE TABLE Comment (
  id INT PRIMARY KEY,
  content TEXT NOT NULL,
  author_name VARCHAR(255),
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
  article_id INT NOT NULL,
  FOREIGN KEY (article_id) REFERENCES Article(id)
);

-- Tạo bảng Tag
CREATE TABLE Tag (
  id INT PRIMARY KEY,
  name VARCHAR(50) NOT NULL UNIQUE,
  description TEXT
);

-- Tạo bảng Article_Tag (bảng liên kết n-n giữa bảng Article và bảng Tag)
CREATE TABLE Article_Tag (
  article_id INT NOT NULL,
  tag_id INT NOT NULL,
  PRIMARY KEY (article_id, tag_id),
  FOREIGN KEY (article_id) REFERENCES Article(id),
  FOREIGN KEY (tag_id) REFERENCES Tag(id)
);

-- Tạo bảng Image
CREATE TABLE Image (
  id INT PRIMARY KEY,
  filename VARCHAR(255) NOT NULL,
  path VARCHAR(255) NOT NULL,
  article_id INT NOT NULL,
  FOREIGN KEY (article_id) REFERENCES Article(id)
);
-- Tạo bảng Rating
CREATE TABLE Rating (
  id INT PRIMARY KEY,
  rating INT NOT NULL,
  comment TEXT,
  article_id INT NOT NULL,
  user_id INT NOT NULL,
  FOREIGN KEY (article_id) REFERENCES Article(id),
  FOREIGN KEY (user_id) REFERENCES User(id)
);
