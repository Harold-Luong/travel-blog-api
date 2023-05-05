CREATE SCHEMA `blogs` ;
use blogs;
-- author
ALTER TABLE blogs.author MODIFY COLUMN full_name varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
INSERT INTO blogs.author (created_at, deleted, updated_at, email, full_name, password, phone, username)
VALUES
('2023-05-05 12:34:56.789', 0, '2023-05-05 12:34:56.789', 'user1@example.com', 'User One', 'password1', '1234567890', 'user1'),
('2023-05-06 09:00:00.000', 1, '2023-05-06 09:00:00.000', 'user2@example.com', 'User Two', 'password2', '0987654321', 'user2');

-- location
ALTER TABLE location MODIFY name VARCHAR(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
INSERT INTO blogs.location (name)
VALUES
('Hà Nội'),
('Hồ Chí Minh'),
('Đà Nẵng');

-- blog;
ALTER TABLE blogs.blog MODIFY COLUMN content1 TEXT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
ALTER TABLE blogs.blog MODIFY COLUMN content2 TEXT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
ALTER TABLE blogs.blog MODIFY COLUMN content3 TEXT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;
ALTER TABLE blogs.blog MODIFY COLUMN title varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;


INSERT INTO blogs.blog (content1, content2, content3, title, author_id, location_id)
VALUES ('Blog content 1 ô', 'Blog content 2 đ', 'blogBlog content 3 ê ơ', 'My First Blog', 1, 1),
('Blog content 4', 'Blog content 5', 'Blog content 6', 'My Second Blog', 1, 2),
('Blog content 7', 'Blog content 8', 'Blog content 9', 'My Second Blog', 2, 2);

-- img_src
INSERT INTO img_src (source, thumbnailtagblog, blog_id) VALUES
('http://example.com/image1.jpg', 'http://example.com/thumbnail1.jpg', 1),
('http://example.com/image2.jpg', 'http://example.com/thumbnail2.jpg', 2);

-- tag
INSERT INTO tag (name) VALUES   ('Travel'), ('Food') ;
-- blog_tag
INSERT INTO blogs.blog_tag (blog_id, tag_id) VALUES
(1, 1),
(1, 2),
(2, 2)





