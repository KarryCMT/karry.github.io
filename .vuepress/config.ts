import { defineUserConfig } from 'vuepress';
import recoTheme from 'vuepress-theme-reco';
import { viteBundler } from '@vuepress/bundler-vite';
import { webpackBundler } from '@vuepress/bundler-webpack';

export default defineUserConfig({
  title: '李同学の代码世界',
  description: 'Just playing around',
  head: [
    ['link', { rel: 'icon', href: '/favicon.ico' }]
  ],
  bundler: viteBundler(),
  theme: recoTheme({
    style: '@vuepress-reco/style-default',
    logo: '/logo.png',
    author: '李同学(karrylee)',
    authorAvatar: '/head.png',
    docsRepo: 'https://github.com/KarryCMT',
    docsBranch: 'main',
    docsDir: 'example',
    lastUpdatedText: '',
    navbar: [
      { text: '首页', link: '/' },
      { text: '分类', link: '/categories/reco/1/' },
      { text: '标签', link: '/tags/tag1/1/' },
    ],
    bulletin: {
      body: [
        {
          type: 'text',
          content: `🎉🎉🎉 `,
          style: 'font-size: 12px;',
        },
        {
          type: 'hr',
        },
        {
          type: 'title',
          content: 'QQ 群',
        },
        {
          type: 'text',
          content: `<ul></ul>`,
          style: 'font-size: 12px;',
        },
        {
          type: 'hr',
        },
        {
          type: 'title',
          content: 'GitHub',
        },
        {
          type: 'text',
          content: `
          <ul>
            <li><a href="https://github.com/vuepress-reco/vuepress-theme-reco-next/issues">Issues<a/></li>
            <li><a href="https://github.com/vuepress-reco/vuepress-theme-reco-next/discussions/1">Discussions<a/></li>
          </ul>`,
          style: 'font-size: 12px;',
        },
        {
          type: 'hr',
        },
        {
          type: 'buttongroup',
          children: [
            {
              text: '打赏',
              link: '/docs/others/donate.html',
            },
          ],
        },
      ],
    },

  }),

});
